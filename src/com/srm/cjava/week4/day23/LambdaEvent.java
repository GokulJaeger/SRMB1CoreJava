package day23;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LambdaEvent extends JFrame {

    private JButton button = new JButton("Click Me!");

    public LambdaEvent() {
            super("Listener Lambda Example");
     
            getContentPane().setLayout(new FlowLayout());
            getContentPane().add(button);
     
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    System.out.println("Handled by anonymous class listener");
                }
            });
     
            button.addActionListener(e -> System.out.println("Handled by Lambda listener"));
     
            button.addActionListener(e -> {
                System.out.println("Handled Lambda listener");
                System.out.println("Have fun!");
            });
     
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(300, 100);
            setLocationRelativeTo(null);
        }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LambdaEvent().setVisible(true);
            }
        });
    }
}
