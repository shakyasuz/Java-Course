import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Register extends JFrame {
    JLabel l0, l1, l2, l3, l4, l5, l6;
    JTextField t0, t1;
    JPasswordField p1, p2;
    JRadioButton r1, r2;
    JCheckBox c1, c2, c3;
    JButton b1;
    JComboBox<String> cb1;
    JScrollPane s1;

    public Register() {
        l0 = new JLabel("ID");
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l3 = new JLabel("Repassword");
        l4 = new JLabel("Gender");
        l5 = new JLabel("Course");
        l6 = new JLabel("Result");
        String[] countries = {"Nepal", "India", "China", "USA"};
        cb1 = new JComboBox<>(countries);
        t0 = new JTextField(20);
        t1 = new JTextField(20);
        p1 = new JPasswordField(20);
        p2 = new JPasswordField(20);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        c1 = new JCheckBox("JAVA");
        c2 = new JCheckBox("C++");
        c3 = new JCheckBox("BCA");
        s1 = new JScrollPane(cb1);
        s1.setPreferredSize(new Dimension(100, 50));
        b1 = new JButton("submit");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = t0.getText();
                String username = t1.getText();
                String password = new String(p1.getPassword());
                String repassword = new String(p2.getPassword());
                String gender = r1.isSelected() ? "male" : "female";
                StringBuilder course = new StringBuilder();
                if (c1.isSelected()) {
                    course.append("JAVA").append(",");
                }
                if (c2.isSelected()) {
                    course.append("C++").append(",");
                }
                if (c3.isSelected()) {
                    course.append("BCA").append(",");
                }
                String country = (String) cb1.getSelectedItem();
                // JDBC connection
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/prime";
                    String dbUsername = "root";
                    String dbPassword = "";
                    Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
                    if (conn != null) {
                        System.out.println("Server Connected");
                    } else {
                        System.out.println("Server not connected");
                    }
                    if (id.isEmpty() || username.isEmpty() || password.isEmpty() || repassword.isEmpty() 
                            || gender.isEmpty() || course.toString().isEmpty() || country.isEmpty()) {
                        l6.setText("Please fill all fields.");
                    } else if (!password.equals(repassword)) {
                        l6.setText("Password and Re-entered Password doesn't match!");
                    } else {
                        System.out.println("-----Inserting data into the database-----");
                        String insQuery = "INSERT INTO users VALUES (?, ?, ? ,?, ?, ?, ?)";
                        PreparedStatement ps = conn.prepareStatement(insQuery);
                        ps.setString(1, id);
                        ps.setString(2, username);
                        ps.setString(3, password);
                        ps.setString(4, repassword);
                        ps.setString(5, gender);
                        ps.setString(6, course.toString());
                        ps.setString(7, country);
                        int rowsInserted = ps.executeUpdate();
                        if (rowsInserted > 0) {
                            l6.setText("Row inserted successfully");
                        } else {
                            l6.setText("Row not inserted");
                        }
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println(ex);
                }
            }
        });
        add(l0);        add(t0);        add(l1);        add(t1);        add(l2);
        add(p1);       add(l3);        add(p2);       add(l4);        add(r1);
        add(r2);        add(l5);        add(c1);       add(c2);       add(c3);
        add(s1);       add(b1);       add(l6);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Form {
    public static void main(String[] args) {
        new Register();
    }
}