package com.srm.cjava.week3.day17;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class SwingTree {

    SwingTree() {
        JFrame f = new JFrame();
        DefaultMutableTreeNode s = new DefaultMutableTreeNode("Anime");
        DefaultMutableTreeNode s2 = new DefaultMutableTreeNode("Dragon Ball Z");
        DefaultMutableTreeNode s3 = new DefaultMutableTreeNode("Naruto");
        DefaultMutableTreeNode s4 = new DefaultMutableTreeNode("Attack On Titans");
        DefaultMutableTreeNode s5 = new DefaultMutableTreeNode("My Hero Academia");
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);

        DefaultMutableTreeNode d1 = new DefaultMutableTreeNode("Goku");
        DefaultMutableTreeNode d2 = new DefaultMutableTreeNode("Vegeta");
        DefaultMutableTreeNode d3 = new DefaultMutableTreeNode("Gohan");
        DefaultMutableTreeNode d4 = new DefaultMutableTreeNode("Trunks");
        DefaultMutableTreeNode d5 = new DefaultMutableTreeNode("Freeza");
        s2.add(d1);
        s2.add(d2);
        s2.add(d3);
        s2.add(d4);
        s2.add(d5);

        DefaultMutableTreeNode n1 = new DefaultMutableTreeNode("Naruto");
        DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("Sasuke");
        DefaultMutableTreeNode n3 = new DefaultMutableTreeNode("Madara");
        DefaultMutableTreeNode n4 = new DefaultMutableTreeNode("Hashirama");
        s3.add(n1);
        s3.add(n2);
        s3.add(n3);
        s3.add(n4);

        DefaultMutableTreeNode aot1 = new DefaultMutableTreeNode("Eren");
        DefaultMutableTreeNode aot2 = new DefaultMutableTreeNode("Levi");

        s4.add(aot1);
        s4.add(aot2);

        DefaultMutableTreeNode mha1 = new DefaultMutableTreeNode("All Might");
        DefaultMutableTreeNode mha2 = new DefaultMutableTreeNode("Deku");
        DefaultMutableTreeNode mha3 = new DefaultMutableTreeNode("Kachan");
        DefaultMutableTreeNode mha4 = new DefaultMutableTreeNode("Shoto");

        s5.add(mha1);
        s5.add(mha2);
        s5.add(mha3);
        s5.add(mha4);

        JTree j = new JTree(s);
        f.add(j);
        f.setSize(200, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingTree();
    }
}
