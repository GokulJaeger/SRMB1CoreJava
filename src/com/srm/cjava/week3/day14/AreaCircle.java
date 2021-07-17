package week3.day14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AreaCircle implements ActionListener {

    Button b1;
    TextField t1;
    Label lb1, lb3;
    Frame f;

    AreaCircle() {
        f = new Frame("Area of a circle");

        lb1 = new Label("Enter radius of a circle :");
        lb1.setBounds(5, 50, 150, 30);
        f.add(lb1);

        t1 = new TextField();
        t1.setBounds(200, 50, 150, 30);
        f.add(t1);

        lb3 = new Label("Area of Circle:");
        lb3.setBounds(90, 140, 150, 30);
        f.add(lb3);

        b1 = new Button("Submit ");
        b1.setBounds(90, 200, 100, 30);
        f.add(b1);

        b1.addActionListener(this);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        f.setLayout(null);
        f.setSize(600, 500);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        float r = Float.parseFloat(t1.getText());
        float area = 0;

        if (e.getSource().equals(b1)) {
            area = (float) 3.14 * r * r;

            lb3.setText(String.valueOf("Result :    " + area));
        }

    }

    public static void main(String args[]) {
        AreaCircle t = new AreaCircle();
        System.out.println(t);
    }
}