import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class squareNumber extends Frame implements ActionListener {
    JLabel l1;
    JTextField t1, t2;
    JButton b1;

    squareNumber() {
        l1 = new JLabel("Enter number:");
        l1.setBounds(20, 100, 100, 20); 

        t1 = new JTextField();
        t1.setBounds(120, 100, 100, 20);

        b1 = new JButton("Square");
        b1.setBounds(20, 170, 80, 20);

        
        t2 = new JTextField();
        t2.setBounds(120, 170, 100, 20);

        add(l1);
        add(t1);
        add(b1);
        add(t2);

        b1.addActionListener(this); 

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            {
              
                int num1 = Integer.parseInt(t1.getText());
                int square = num1 * num1;

                t2.setText(String.valueOf(square));
            } 
        }
    }

    public static void main(String[] args) {
        squareNumber ap = new squareNumber();
    }
}
