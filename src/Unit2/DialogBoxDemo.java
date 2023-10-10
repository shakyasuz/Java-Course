package Unit2;
// a pop up box that appears to show warning message or normal message

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Dialogs {
    public void setDialog(){
     JFrame f=new JFrame();
     //welcome or normal message 
    JOptionPane.showMessageDialog(f, "Welcome to page");
    //warning message
    JOptionPane.showMessageDialog(f, "Error", "Warning", JOptionPane.WARNING_MESSAGE);
    //input messsage 
    JOptionPane.showMessageDialog(f, "Enter faculty");
    //confirm message 
    JOptionPane.showMessageDialog(f, "Are you sure to continue?");
    //using JDialog
    JButton b1=new JButton ("ClickME");
    f.add(b1);
    f.setVisible(true);
    f.setSize(400,400);
    f.setLayout(new FlowLayout());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    b1.addActionListener(new ActionListener(){
         @Override
    public void actionPerformed(ActionEvent e){
        JDialog da=new JDialog(f, "message");
        da.setVisible(true);
        da.setSize(200,200);
        da.add(new JLabel("Welcome to CSIT"));
        da.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE); 
        
    }
    });
   
    
    
}
}

public class DialogBoxDemo {
    public static void main(String[] args) {
        Dialogs d1=new Dialogs();
        d1.setDialog();
             
        
        
    }
    
}
