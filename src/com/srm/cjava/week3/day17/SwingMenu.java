package com.srm.cjava.week3.day17;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class SwingMenu implements Runnable {
    private JFrame frame;

    public void run() {
        createAndShowGui();
    }

    private void createAndShowGui() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setJMenuBar(createMenuBar());
        frame.setSize(400, 350);
        frame.setUndecorated(true);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    private JMenu createEditMenu() {
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        editMenu.add(cutItem);
        JMenuItem copyItem = new JMenuItem("Copy");
        editMenu.add(copyItem);
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(pasteItem);
        JMenuItem delete = new JMenuItem("Delete");
        editMenu.add(delete);
        JMenuItem selectall = new JMenuItem("Select All");
        editMenu.add(selectall);
        JMenuItem history = new JMenuItem("History");
        editMenu.add(history);
        JMenuItem properties = new JMenuItem("Properties");
        editMenu.add(properties);
        return editMenu;
    }

    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New Window");
        fileMenu.add(newItem);
        JMenuItem powershell = new JMenuItem("New Window Powershell");
        fileMenu.add(powershell);
        JMenuItem openItem = new JMenuItem("Open Window");
        fileMenu.add(openItem);
        JMenuItem saveItem = new JMenuItem("Save");
        fileMenu.add(saveItem);
        JMenuItem option = new JMenuItem("Option");
        fileMenu.add(option);
        JMenuItem help = new JMenuItem("Help");
        fileMenu.add(help);
        JMenuItem exit = new JMenuItem("Exit");
        fileMenu.add(exit);
        return fileMenu;
    }


    private JMenu createShareMenu() {
        JMenu shareMenu = new JMenu("Share");
        JMenuItem share = new JMenuItem("Share");
        shareMenu.add(share);
        JMenuItem email = new JMenuItem("Email");
        shareMenu.add(email);
        JMenuItem zip = new JMenuItem("Zip");
        shareMenu.add(zip);
        JMenuItem accesscontrol = new JMenuItem("Access Control");
        shareMenu.add(accesscontrol);
        return shareMenu;
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        menuBar.add(createEditMenu());
        menuBar.add(createShareMenu());
        return menuBar;
    }

    public static void main(String[] args) {
        UIManager.put("MenuBar.background", Color.LIGHT_GRAY);
        EventQueue.invokeLater(new SwingMenu());
    }
}