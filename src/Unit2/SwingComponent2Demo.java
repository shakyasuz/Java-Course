package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingComponent2 extends JFrame{
    //combobox generates two types of events
    //action event : when combo box is clicked
    //item event: when item is selected from combobox
    JComboBox cb1;
    JLabel l1;
    public void setComponents(){
        String [] country={"Nepal","China", "India", "Germany", "England" };
        cb1=new JComboBox(country);
        l1=new JLabel("result");
        add(cb1);add(l1);
        setVisible(true);
        setSize(200, 400);
        setLayout (new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //handling event generated from combobox: ItemEvent
        cb1.addItemListener( new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                String item=(String)cb1.getSelectedItem();
                l1.setText("You selected"+ item);
            }
    });
    }
}
public class SwingComponent2Demo {
    public static void main(String[] args) {
        SwingComponent2 sc=new SwingComponent2();
        sc.setComponents();
    }
}
