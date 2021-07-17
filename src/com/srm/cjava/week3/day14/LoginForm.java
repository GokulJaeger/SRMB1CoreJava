package week3.day14;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends Frame implements ActionListener {
    Label l1 = new Label("UserName");
    Label l2 = new Label("Password");
    Label l3 = new Label(" ");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    Button b = new Button("Submit");

    public LoginForm() {
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(l3);
        l1.setBounds(20, 45, 70, 20);
        t1.setBounds(180, 45, 200, 20);
        l2.setBounds(20, 95, 70, 20);
        t2.setBounds(180, 95, 200, 20);
        b.setBounds(310, 145, 70, 20);
        b.addActionListener(this);
        t2.setEchoChar('*');
        addWindowListener(new Adapter());
    }

    public void actionPerformed(ActionEvent e) {
        l3.setText("Hello " + t1.getText());
    }

    public static void main(String s[]) {
        LoginForm l = new LoginForm();
        l.setSize(new Dimension(600, 600));
        l.setTitle("Login");
        l.setVisible(true);
    }
}

class Adapter extends WindowAdapter {
    public Adapter() {
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
