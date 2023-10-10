package Unit2;

import javax.swing.*;
import java.awt.*;
//divide the content into two part with slider
class Splits extends JFrame{
    JComboBox c1;
    JTextField t1;
    JPanel p1,p2;
    
    public void setSplit(){ 
    String [] country={"Nepal", "India", "Japan", "Germany", "South Korea"};
    c1=new JComboBox(country);
    t1=new JTextField(10);
    p1 =new JPanel();
    p2=new JPanel();
    p1.add(c1);p2.add(t1);
    //creating splitpane
    JSplitPane sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2 );
    // to collapse and release component
    sp.setOneTouchExpandable(true);
    //to maintain gap
    sp.setDividerSize(50);
    add(sp);
    setVisible(true);
    setSize(400, 400);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
public class SplitPaneDemo {
    public static void main(String[] args) {
        Splits s=new Splits();
        s.setSplit();
    }
    
}
