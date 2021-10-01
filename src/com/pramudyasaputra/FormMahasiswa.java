package com.pramudyasaputra;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMahasiswa {
    private JButton buttonSubmit;
    private JTable tableStudent;
    private JTextField fieldNIM;
    private JTextField fieldName;
    private JTextField fieldHeight;
    private JComboBox fieldTransfer;
    private JLabel labelNIM;
    private JLabel labelHeight;
    private JLabel lableName;
    private JLabel lableTransfer;
    private JPanel mainPanel;
    DefaultTableModel tableModel;

    public FormMahasiswa() {
        setOptionTransfer();
        tableModel = new DefaultTableModel();
        tableModel.addColumn("No");
        tableModel.addColumn("NIM");
        tableModel.addColumn("Nama");
        tableModel.addColumn("Tinggi");
        tableModel.addColumn("Transfer");
        tableStudent.setModel(tableModel);

        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MahasiswaController action = new MahasiswaController();

                Boolean transfer = false;

                if(fieldTransfer.getSelectedItem().equals("True")){
                    transfer = true;
                }

                action.create(fieldNIM.getText(),fieldName.getText(),Integer.parseInt(fieldHeight.getText()),transfer);

                Integer index = 0;
                for(Mahasiswa data:action.all()) {
                    tableModel.addRow(new String[]{String.valueOf(index + 1),data.getNim(),data.getNama(), data.getTinggi() + "cm", String.valueOf(data.isPindahan())});
                }
                tableStudent.setModel(tableModel);
            }
        });
    }

    public void setOptionTransfer()
    {
        fieldTransfer.addItem("False");
        fieldTransfer.addItem("True");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("APP");
        frame.setContentPane(new FormMahasiswa().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
