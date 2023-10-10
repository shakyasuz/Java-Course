//place a component as asa seq of card ie one component is place
//behind another  and onlly one component is shown at a time
package unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Cards extends  JFrame {
    JButton b1,b2,b3,b4;
    JPanel p1;//small window
    public void setCard(){
        b1=new JButton("Button1:");
       b2=new JButton("Button2");
       b3=new JButton("Button3");
       b4=new JButton("Button4");
       p1=new JPanel ();
CardLayout c1=new CardLayout();
       p1.setLayout(c1);
       add(p1);
       setVisible(true);
       setSize(400,400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    //adding component in pane
    p1.add(b1,"Button1");
    p1.add(b2,"Button2");
    p1.add(b3,"Button3");
    p1.add(b4,"Button4");
    
    //to  show next component
    c1.next(p1);
    //showing previous comp
    c1.previous(p1);
    //showing componetn of own choice
    // c1.show(p1,"Button1");
    }

   
}



public class CardLayoutDemo {
     public static void main(String[] args) {
        Cards obj=new Cards();
        obj.setCard();

        
    }
    
}

