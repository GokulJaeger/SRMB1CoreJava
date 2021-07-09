package com.srm.cjava.week3.day15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ColorScroll extends JFrame implements AdjustmentListener
{
    JScrollBar red;
    JScrollBar green;
    JScrollBar blue;
    int cr=10;
    int cg=10;
    int cb=10;


    ColorScroll()
    {
        super("SCROLLBAR DEMO");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        red=new JScrollBar(JScrollBar.HORIZONTAL);
        green=new JScrollBar(JScrollBar.HORIZONTAL);
        blue=new JScrollBar(JScrollBar.HORIZONTAL);
        add(red);
        add(green);
        add(blue);
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);   
    }

    public void adjustmentValueChanged(AdjustmentEvent ae)
    {

        if(ae.getSource()==red)
            cr=ae.getValue();
        else if(ae.getSource()==green)
            cg=ae.getValue();
        else if(ae.getSource()==blue)
            cb=ae.getValue();
        System.out.println(cr + ":" + cg + ":" + cb);

        // add color to content pane
        this.getContentPane().setBackground(new Color(cr,cg,cb)); 
    }


    public static void main(String args[])
    {
        ColorScroll obj=new ColorScroll();  
    }
}
