package unit2;
import javax.swing.*;
import java.awt.*;



class Grid extends  JFrame{
    JButton b1,b2,b3,b4,b5,b6;
    public void setGrid(){
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");
        b6=new JButton("Button6");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        setLayout(new GridLayout(2,2,5,5));
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
public class GridLayoutDemo {
    public static void main(String[] args) {
        Grid g1=new Grid();
        g1.setGrid();
    }

    
}