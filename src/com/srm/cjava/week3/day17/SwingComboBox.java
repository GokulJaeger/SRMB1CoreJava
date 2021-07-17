package week3.day17;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class SwingComboBox extends JFrame implements ItemListener {
    static JFrame f;
    static JLabel a, b;
    static JComboBox c;

    public static void main(String[] args) {
        f = new JFrame("Hero List");
        SwingComboBox st = new SwingComboBox();
        f.setLayout(new FlowLayout());
        String str[] = { "Goku", "Deku", "Eren Jaeger", "Naruto", "Optimus Prime", "Tanjiro", "Ash", "Natsu", "Levi", "Senku" };
        c = new JComboBox(str);
        c.addItemListener(st);
        a = new JLabel("Select Your Hero");
        b = new JLabel("________");
        a.setForeground(Color.black);
        b.setForeground(Color.red);
        JPanel pa = new JPanel();
        pa.add(a);
        pa.add(c);
        pa.add(b);
        f.add(pa);
        f.setSize(500, 400);
        f.show();
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c) {
            b.setText(c.getSelectedItem() + " is Selected");
        }
    }
}