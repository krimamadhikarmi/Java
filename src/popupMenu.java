
import javax.swing.*;
import java.awt.event.*;
public class popupMenu {
    public static void main(String[] args) {
        JFrame f= new JFrame("PopupMenu");
        JPopupMenu popupMenu= new JPopupMenu("Edit");
        JMenuItem cut= new JMenuItem("Cut");
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem paste=new JMenuItem("Paste");
        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                popupMenu.show(f, e.getX(),e.getY());
            }
        });
        f.add(popupMenu);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
}
