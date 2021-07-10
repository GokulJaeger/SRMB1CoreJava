package com.srm.cjava.week3.day15;

import java.awt.*;  
import java.awt.event.*;  
public class WindowsEvent extends KeyAdapter{  
    Label l;  
    TextArea area;  
    Frame f;  
    WindowsEvent(){  
        f=new Frame("Key Adapter Class");  
        l=new Label();  
        l.setBounds(20,50,200,20);  
        area=new TextArea();  
        area.setBounds(20,80,300, 300);  
        area.addKeyListener(this);  
           
        f.add(l);f.add(area);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
    public void keyReleased(KeyEvent e) {  
        String text=area.getText();  
        String words[]=text.split(" ");  
        l.setText("Words: "+ words.length +" Characters:"+text.length());  
    }  
   
    public static void main(String[] args) {  
        new WindowsEvent();  
    }  
}
