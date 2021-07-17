package week3.day15;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListen implements KeyListener {
    Label lb1, lbl2, lb;
    TextField tf1;
    Frame fr;
    String s;

    KeyListen() {

        fr = new Frame("KeyEventListener Example");

        lb1 = new Label(" Key Events will be displayed based on the actions", Label.CENTER);
        lbl2 = new Label();
        lb = new Label();

        tf1 = new TextField(20);

        fr.setLayout(new FlowLayout());

        fr.add(lb1);

        fr.add(tf1);

        fr.add(lbl2);

        tf1.addKeyListener(this);

        fr.setSize(460, 250);

        fr.setVisible(true);
    }

    public void keyPressed(KeyEvent ev) {
        lbl2.setText("Pressed Key");
    }

    public void keyReleased(KeyEvent ev) {
        lbl2.setText(" Released key");
    }

    public void keyTyped(KeyEvent ev) {
        lbl2.setText("Key is typed");
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new KeyListen();
    }
}

// import java.awt.BorderLayout;
// import java.awt.Container;
// import java.awt.event.KeyEvent;
// import java.awt.event.KeyListener;

// import javax.swing.JFrame;
// import javax.swing.JTextField;

// public class KeyListen {

// public static void main(String args[]) {
// JFrame frame = new JFrame("Key Listener");
// Container contentPane = frame.getContentPane();
// KeyListener listener = new KeyListener() {
// @Override
// public void keyPressed(KeyEvent event) {
// printEventInfo("Key Pressed", event);
// }
// @Override
// public void keyReleased(KeyEvent event) {
// printEventInfo("Key Released", event);
// }
// @Override
// public void keyTyped(KeyEvent event) {
// printEventInfo("Key Typed", event);
// }
// private void printEventInfo(String str, KeyEvent e) {
// System.out.println(str);
// int code = e.getKeyCode();
// System.out.println(" Code: " + KeyEvent.getKeyText(code));
// System.out.println(" Char: " + e.getKeyChar());
// int mods = e.getModifiersEx();
// System.out.println(" Mods: "
// + KeyEvent.getModifiersExText(mods));
// System.out.println(" Location: "
// + keyboardLocation(e.getKeyLocation()));
// System.out.println(" Action? " + e.isActionKey());
// }
// private String keyboardLocation(int keybrd) {
// switch (keybrd) {
// case KeyEvent.KEY_LOCATION_RIGHT:
// return "Right";
// case KeyEvent.KEY_LOCATION_LEFT:
// return "Left";
// case KeyEvent.KEY_LOCATION_NUMPAD:
// return "NumPad";
// case KeyEvent.KEY_LOCATION_STANDARD:
// return "Standard";
// case KeyEvent.KEY_LOCATION_UNKNOWN:
// default:
// return "Unknown";
// }
// }
// };
// JTextField textField = new JTextField();
// textField.addKeyListener(listener);
// contentPane.add(textField, BorderLayout.NORTH);
// frame.pack();
// frame.setVisible(true);
// }
// }
