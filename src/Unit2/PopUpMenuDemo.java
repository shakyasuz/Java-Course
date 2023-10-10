package Unit2;
import javax.swing.*;
import java.awt.*;
class PopUp extends JFrame{
    public void setPop(){
            JPopupMenu p1= new JPopupMenu();
            JMenuItem i1= new JMenuItem ("view");
            JMenuItem i2= new JMenuItem ("refresh");
            JMenuItem i3= new JMenuItem ("copy");
            p1.add(i1) ;p1.add(i2); p1.add(i3);
            add(p1);
            setVisible(true);
            setSize(400,400);
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            p1.show(this,150, 150  );
}
}

public class PopUpMenuDemo {
    public static void main(String[] args) {
        PopUp p1= new PopUp();
        p1.setPop();
    }
}
    
