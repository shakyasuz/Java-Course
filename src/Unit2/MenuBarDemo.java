package Unit2;
//menu bar is a tab that contains sequence of items known as menu
//contains collection of items known as menu items 
import javax.swing.*;
import java.awt.*;
class Menu extends JFrame{
    public void setMenu(){
        //creating meny bar
        JMenuBar mb=new JMenuBar();
        //creating first menu
        JMenu m1=new JMenu ("File");
        //adding mnemonic : shortcut keys
         m1.setMnemonic('f');
        //creating menu item for first menu 
        JMenuItem i1= new JMenuItem ("Open", 'o');
        JMenuItem i2= new JMenuItem ("Save", 's');
        JMenuItem i3= new JMenuItem ("Save as ", 'a');
        //adding item on menu1
        m1.add(i1); m1.add(i2); m1.add(i3);
        //adding menu on menu bar 
        mb.add(m1);
        //adding branching : adding sub component on particular menu Item 
        JMenu m2 =new JMenu("New");
                 m2.setMnemonic('n');
        JMenuItem i4=new JMenuItem("Open file ");
        JMenuItem i5=new JMenuItem(" Open Folder");
        JMenuItem i6=new JMenuItem("Open Result ");
        m2.add(i4); m2.add(i5);m2.add(i6);
        m1.add(m2);
        //checkboxmenuitem: can be set on and off
        JMenu m3 =new JMenu("Edit");
        JCheckBoxMenuItem c1= new JCheckBoxMenuItem("Copy", true); //already check will happen 
        JCheckBoxMenuItem c2= new JCheckBoxMenuItem("Paste");      
        JCheckBoxMenuItem c3= new JCheckBoxMenuItem("Cut");
        m3.add(c1); m3.add(c2);m3.add(c3);
        mb.add(m3);
        //radiobutton menu item 
        JMenu m4=new JMenu ("View");
        JRadioButtonMenuItem r1= new JRadioButtonMenuItem("Copy", true); //already check will happen 
        JRadioButtonMenuItem r2= new JRadioButtonMenuItem("Paste");      
         m4.add(r1); m4.add(r2);
        mb.add(m4);
        add(mb); //adding meny bar on JFrame 
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
public class MenuBarDemo {
    public static void main(String[] args) {
        Menu m1=new Menu();
        m1.setMenu();
        
    }
    
}
