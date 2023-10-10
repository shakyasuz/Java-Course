
package Unit2;
//places the content 
import javax.swing.*;
import java.awt.*;

class GridBag extends  JFrame{
    JButton b1,b2,b3,b4,b5,b6;
    public void setGridBag(){
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");
        b6=new JButton("Button6");
      //  add(b1);
        //add(b2);
        //add(b3);
        //add(b4);
        //add(b5);
        //add(b6);

GridBagLayout gb1=new GridBagLayout();
//adding grid bag constraints

GridBagConstraints gbc=new GridBagConstraints();
setVisible(true);
setSize(500,500);
//adding grid layout
setLayout(gb1);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//adding b1 in coordinate 0,0; // make at left side of screen 
gbc.gridx=0;
gbc.gridy=0;
add(b1,gbc);
//adding b2 in coordinate 1,0
gbc.gridx=1;
gbc.gridy=1;
add(b2,gbc);
//adding b3 on coordinates 1,0 with allocating 2 cell
//gbc.gridwidth=2; //giving 2 cell
gbc.gridx=2;
gbc.gridy=2;
gbc.fill=GridBagConstraints.HORIZONTAL; //arrange content horizontally 
add(b3, gbc);
//adding b4 in coordinate 1,0
gbc.gridx=3;
gbc.gridy=3;
add(b4,gbc);
//adding b5 in coordinate 1,0
gbc.gridx=4;
gbc.gridy=4;
add(b5,gbc);
//adding b6 in coordinate 1,0
gbc.gridx=6;
gbc.gridy=6;
add(b6,gbc);

 }
}
    
public class GridBagLayoutDemo{
    public static void main(String[] args) {
        GridBag gb=new GridBag();
        gb.setGridBag();
        
    }
    
}
