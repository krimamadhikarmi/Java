import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menuMenubar {
    public static void main(String[] args) {
        JMenu menu,submenu;
        JMenuItem i1,i2,i3,i4,i5;
        JFrame f= new JFrame("Menu and MenuItem Example");
        JMenuBar mb= new JMenuBar();
        menu=new JMenu("Menu");
        submenu= new JMenu("Submenu");
        i1=new JMenuItem("Item1");
        i2=new JMenuItem("Item2");
        i3=new JMenuItem("Item3");
        i4=new JMenuItem("Item4");
        i5=new JMenuItem("Item5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


        
    }
}
