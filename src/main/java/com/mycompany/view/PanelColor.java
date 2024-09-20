/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelColor extends JPanel {
    private JButton btnRed;
    private JButton btnGreen;
    private JButton btnBlue;

    public PanelColor() {
        this.setLayout(new GridLayout(1, 3));  // Tres botones en una fila

        btnRed = new JButton("Red");
        btnGreen = new JButton("Green");
        btnBlue = new JButton("Blue");

        this.add(btnRed);
        this.add(btnGreen);
        this.add(btnBlue);
    }

    public void listenerButton(ActionListener controller) {
        btnRed.addActionListener(controller);
        btnGreen.addActionListener(controller);
        btnBlue.addActionListener(controller);
    }

    public JButton getBtnRed() {
        return btnRed;
    }

    public JButton getBtnGreen() {
        return btnGreen;
    }

    public JButton getBtnBlue() {
        return btnBlue;
    }
}

