package lab;
//create a simple login form using GridLayout in java
import javax.swing.*;
import java.awt.*;

public class gridLayout {
    private  JFrame f;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JButton resetButton;
    gridLayout()
    {
        f=new JFrame();
        f.setTitle("Login Form");
        f.setLayout(new GridLayout(4,2,10,10));

        userLabel = new JLabel("Username");
        userLabel.setHorizontalAlignment(JLabel.CENTER);
        f.add(userLabel);

        userText = new JTextField();
        userLabel.setHorizontalAlignment(JTextField.CENTER);
        f.add(userText);

        passwordLabel = new JLabel("Username");
        passwordLabel.setHorizontalAlignment(JLabel.CENTER);
        f.add(passwordLabel);

        passwordText = new JPasswordField();
        userLabel.setHorizontalAlignment(JTextField.CENTER);
        f.add(passwordText);
     
        loginButton=new JButton("Login");
        f.add(loginButton);

        resetButton=new JButton("Reset");
        f.add(resetButton);

        f.setSize(300,200);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new gridLayout();
    }
}
