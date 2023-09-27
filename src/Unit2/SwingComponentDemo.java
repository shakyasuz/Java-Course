package Unit2;
import javax.swing.*;
import java.awt.*;
class SwingControls extends JFrame { //Jframe is window 
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JPasswordField p1, p2;
    JRadioButton r1,r2;
    JCheckBox c1, c2, c3;
    JButton b1;  //every thing is instance variable
    public void setControls(){
        l1=new JLabel("Username");
        l2= new JLabel("Password");
        l3= new JLabel("Repassword");
        l4= new JLabel("Gender");
        l5= new JLabel("Course");
        t1=new JTextField(20);
        p1=new JPasswordField(20);
        p2= new JPasswordField(20);
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        c1=new JCheckBox("java");
        c2=new JCheckBox("Php");
        c3=new JCheckBox("DBMS");
        b1= new JButton("Submit");
        //adding button group for radiobutton
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        
        //adding component to window 
        add(l1); add(t1);
        add(l2);add(p1);
        add(l3);add(p2);
        add(l4);add(r1);add(r2);
        add(l5);add(c1);add(c2);add(c3);
        add(b1);
        //adding features of window 
        setVisible(true); //displaying window 
        setSize(500,500); //setting size of window
        setLayout(new FlowLayout());
        //if cancel sign is pressed then program is close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class SwingComponentDemo {
    public static void main(String[] args) {
        SwingControls sc =new SwingControls();
        sc.setControls();
    }
}
