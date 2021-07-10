package com.srm.cjava.week3.day17;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingScroll {

    private static final long serialVersionUID = 1L;

    private static void createAndShowGUI() {

        final JFrame frame = new JFrame("Scroll Pane Example");
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());

        String[] str = {"Asparagus",
        "\nAvocado",
        "\nBBQ vegies",
        "\nBean",
        "\nBeetroot",
        "\nBeetroot and potato salad",
        "\nBok choy", "pak choy or Chinese chard",
        "\nBroccoli",
        "\nBrussels sprouts",
        "\nButternut pumpkin in orange",
        "\nCabbage",
        "\nCapsicum",
        "\nCarrot",
        "\nCarrot and parsnip muffins",
        "\nCauliflower",
        "\nCauliflower and broccoli gratin",
        "\nCeleriac",
        "\nCelery",
        "\nChickpea and couscous salad",
        "\nChinese broccoli or gai lan",
        "\nChinese cabbage or wong bok",
        "\nCitrus coleslaw",
        "\nCorn or sweet corn",
        "\nCrunchy Waldorf salad",
        "\nCucumber",
        "\nEggplant, aubergine or brinjal",
        "\nEggplant dip",
        "\nFennel",
        "\nGreek salad",
        "\nGuacamole",
        "\nHoneyed greens",
        "\nItalian pasta salad",
        "\nLettuce",
        "\nMexican corn and tomato salad",
        "\nMushroom",
        "\nMustard and honey corn on the cob",
        "\nOnion",
        "\nParsnip",
        "\nPeas",
        "\nPotato",
        "\nPotato caesar salad",
        "\nPumpkin",
        "\nRadish",
        "\nRatatouille",
        "\nSalsa",
        "\nSesame brussels sprouts",
        "\nSpinach",
        "\nSquash",
        "\nSwede",
        "\nSweet potato or kumera",
        "\nTabbouleh",
        "\nThai beef salad",
        "\nThai noodle salad",
        "\nTomato",
        "\nTomato and garlic bruschetta",
        "\nTuna and avocado salad",
        "\nTurnip",
        "\nVegetable stock",
        "\nVegie curry",
        "\nVegie lentil soup",
        "\nWalnut lentil salad",
        "\nWarm roasted vegetable salad",
        "\nWarm squid salad",
        "\nZucchini or courgette"};

        JTextArea textArea = new JTextArea(10, 10);
        for(int i=0;i<str.length;i++){
            textArea.append(str[i]);
        }
        JScrollPane scrollableTextArea = new JScrollPane(textArea);

        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.getContentPane().add(scrollableTextArea);

    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                createAndShowGUI();
            }

        });
    }

}
