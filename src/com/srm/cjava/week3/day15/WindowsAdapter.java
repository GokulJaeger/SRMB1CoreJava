package com.srm.cjava.week3.day15;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
public class WindowsAdapter {
  JFrame window = new JFrame("Sketcher");
  public WindowsAdapter() {
    window.setBounds(30, 30, 300, 300);
    window.addWindowListener(new WindowHandler());
    window.setVisible(true);
  }
  class WindowHandler extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
      System.out.println("closing");
      window.dispose(); // Release the window resources
      System.exit(0); // End the application
    }
  }
  public static void main(String[] args) {
    new WindowsAdapter();
  }
}
