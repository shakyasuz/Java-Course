package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.*;
import java.util.*;

class SwingComponent2 extends JFrame{
    JComboBox obj1;
    JLabel l1;
    
    //JList contains list of item with scroll bar
    //it throws list selection event when selection is done
    JList<String> jl1;
    JLabel l2;
    public void setComponents(){
        String []subject={"java","DBA","DWDM","Project"};
        obj1 = new JComboBox(subject);
        l1= new JLabel("Result");
        String []extra= {"DL","SE","POM","AI"};
        jl1=new JList(extra);
        l2 = new JLabel("Result of jlist");
        jl1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//multiple value can be selected
        JScrollPane sp = new JScrollPane();
        sp.add(jl1);
        //adding component
        add(obj1);
        add(l1);
        add(jl1);
        add(l2);
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        obj1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                String item = (String) obj1.getSelectedItem();
                l1.setText("You selected "+item);
            }
        });
        //handeleing event generated list
        jl1.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                ArrayList <String> str=(ArrayList <String>) jl1.getSelectedValuesList();
                for(String r1:str){
                    l2.setText(r1+", ");
                }
            }
            
        });
    }
}
public class SwingComponent2Demo {
    public static void main(String[] args) {
        SwingComponent2 s = new SwingComponent2();
        s.setComponents();
    }
    
}
