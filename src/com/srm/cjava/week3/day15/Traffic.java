package week3.day15;

import java.awt.*;
import java.awt.event.*;

class Traffic extends Frame implements ItemListener {
    String clr = "";

    Traffic() {
        Checkbox c1, c2, c3;
        CheckboxGroup cbg = new CheckboxGroup();
        c1 = new Checkbox("Red", true, cbg);
        c2 = new Checkbox("Green", true, cbg);
        c3 = new Checkbox("Yellow", true, cbg);
        setSize(500, 500);
        setTitle("Traffic Signal");
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(c1);
        add(c2);
        add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    public static void main(String[] args) {
        new Traffic();
    }

    public void itemStateChanged(ItemEvent e) {
        clr = (e.getItem()).toString();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Traffic signals", 200, 250);
        g.drawOval(200, 300, 50, 50);
        g.drawOval(200, 400, 50, 50);
        g.drawOval(200, 500, 50, 50);

        if (clr.equals("Red")) {
            g.setColor(Color.red);
            g.fillOval(200, 300, 50, 50);
        }
        if (clr.equals("Green")) {
            g.setColor(Color.green);
            g.fillOval(200, 400, 50, 50);
        }
        if (clr.equals("Yellow")) {
            g.setColor(Color.yellow);
            g.fillOval(200, 500, 50, 50);
        }
    }
}
