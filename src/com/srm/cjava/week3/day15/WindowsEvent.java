package com.srm.cjava.week3.day15;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class WindowsEvent extends Frame implements WindowListener
{
 Label l1,l2;
 TextField t1,t2;
 Button b1;
 public WindowsEvent()
 {
  super("Implementing Window Listener");
  setLayout(new GridLayout(4,2));
  l1=new Label("Name");
  l2=new Label("Password");

  t1=new TextField(10);
  t2=new TextField(10);
  t2.setEchoChar('*');

  b1=new Button("Send");

  add(l1);
  add(t1);
  add(l2);
  add(t2);
  add(b1);

  addWindowListener(this);
 }
 public static void main(String args[])
 {
    WindowsEvent d=new WindowsEvent();
  d.setSize(400,400);
  d.setVisible(true);
 }
 public void windowClosing(WindowEvent we)
 {
  this.setVisible(false);
  System.exit(0);
 }
 public void windowActivated(WindowEvent we)
 {
 }
 public void windowDeactivated(WindowEvent we)
 {
 }
 public void windowOpened(WindowEvent we)
 {
 }
 public void windowClosed(WindowEvent we)
 {
 }
 public void windowIconified(WindowEvent we)
 {
 }
 public void windowDeiconified(WindowEvent we)
 {
 }
}
