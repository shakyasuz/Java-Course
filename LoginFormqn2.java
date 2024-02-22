package Practical;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Login extends JFrame {
    JLabel l1, l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1;

    public void setLogin() {
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        t1 = new JTextField(20);
        p1 = new JPasswordField(20);
        b1 = new JButton("Submit");
        add(l1);
        add(t1);
        add(l2);
        add(p1);
        add(b1);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uname = t1.getText();
                String pass = new String(p1.getPassword());

                try {
                    Connection conn;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/prime";
                    String dbUsername = "root";
                    String dbPassword = ""; // Provide your database password here
                    conn = DriverManager.getConnection(url, dbUsername, dbPassword);

                    // Check if connection is successful
                    if (conn != null) {
                        System.out.println("Server Connected");
                    } else {
                        System.out.println("Server not connected");
                    }

                    // Prepare and execute login query
                    String loginQuery = "SELECT * FROM users WHERE Username = ? AND Password = ?";
                    PreparedStatement ps = conn.prepareStatement(loginQuery);
                    ps.setString(1, uname);
                    ps.setString(2, pass);
                    ResultSet rs = ps.executeQuery();

                    // Process login result
                    if (rs.next()) {
                        System.out.println("Login success");
                        System.out.println("Data are:");
                        System.out.println("ID: " + rs.getInt("ID"));
                        System.out.println("Username: " + rs.getString("Username"));
                        System.out.println("Gender: " + rs.getString("Gender"));
                        System.out.println("Course: " + rs.getString("Course"));
                        System.out.println("Country: " + rs.getString("Country"));
                    } else {
                        System.out.println("Username or password incorrect");
                    }

                } catch (ClassNotFoundException | SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}

public class LoginForm {
    public static void main(String[] args) {
        Login loginFrame = new Login();
        loginFrame.setLogin();
    }
}