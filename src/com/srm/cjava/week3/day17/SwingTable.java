package com.srm.cjava.week3.day17;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class SwingTable extends JFrame {
    public SwingTable() {
        String[] columns = new String[] { "Id", "Name", "Rate", "Checked" };
        Object[][] data = new Object[][] { { 1, "Goku", 45.0, false }, { 2, "Eren", 70.0, false },
                { 3, "Deku", 90.0, true }, { 4, "Natsu", 60.0, true }, { 5, "Naruto", 124.0, true }, { 6, "Senku", 87.0, true }, { 7, "KickButoski", 45.0, true },};

        final Class[] columnClass = new Class[] { Integer.class, String.class, Double.class, Boolean.class };

        DefaultTableModel model = new DefaultTableModel(data, columns) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnClass[columnIndex];
            }
        };

        JTable table = new JTable(model);

        this.add(new JScrollPane(table));

        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingTable();
            }
        });
    }
}