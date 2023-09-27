package Unit2;
import javax.swing.*; //for swing component
import java.awt.*; //for awt component 
import java.awt.event.*; //for event handling 
class UserInput extends JFrame{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2,b3;
    //method 
    public void setInput(){
        l1=new JLabel("Enter first number");
        l2=new JLabel("Enter second number");
        l3=new JLabel("result");
        t1=new JTextField(15);
        t2=new JTextField(15);
        b1=new JButton("sum");
        b2=new JButton("Multiply");
        b3=new JButton("Divide");
        //adding component to window 
        add(l1); add(t1);
        add(l2);add(t2);
        add(b1);add(b2);add(b3);add(l3);
        //adding window specificaition
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //handling event generatd from buttoin 
        
        b1.addActionListener (new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            int num1= Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int sum=num1 + num2;
            l3.setText("sum is "+sum);
        }
    });
        //for multiply
         b2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            int num1= Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int mul=num1 * num2;
            l3.setText("Multiply is "+mul);
        }
    });
         //for division 
          b3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            int num1= Integer.parseInt(t1.getText());
            int num2=Integer.parseInt(t2.getText());
            int div=num1 / num2;
            l3.setText("Division is "+div);
        }
    });
        
    }
}
public class UserInputDemo {
    public static void main(String[] args) {
        UserInput u= new UserInput();
        u.setInput();
    }
}
