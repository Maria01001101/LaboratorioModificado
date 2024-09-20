/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.view.GUIFrame;
import com.mycompany.view.PanelCanvas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private GUIFrame guiFrame;
    private PanelCanvas panelCanvas;

    public Controller() {
        this.guiFrame = new GUIFrame();
        this.panelCanvas = guiFrame.getPanelCanvas();

        // Asociar los botones del panel de colores con el controlador
        this.guiFrame.getPanelColor().listenerButton(this);
        // Asociar los botones del panel de movimiento con el controlador
        this.guiFrame.getPanelMove().listenerButton(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Movimiento en PanelMove
        if (e.getSource() == guiFrame.getPanelMove().getBtnUp()) {
            panelCanvas.moveUp();
        } else if (e.getSource() == guiFrame.getPanelMove().getBtnDown()) {
            panelCanvas.moveDown();
        } else if (e.getSource() == guiFrame.getPanelMove().getBtnLeft()) {
            panelCanvas.moveLeft();
        } else if (e.getSource() == guiFrame.getPanelMove().getBtnRight()) {
            panelCanvas.moveRight();
        }

        // Cambio de color en PanelColor
        else if (e.getSource() == guiFrame.getPanelColor().getBtnRed()) {
            this.panelCanvas.setColor(Color.RED);
        } else if (e.getSource() == guiFrame.getPanelColor().getBtnGreen()) {
            this.panelCanvas.setColor(Color.GREEN);
        } else if (e.getSource() == guiFrame.getPanelColor().getBtnBlue()) {
            this.panelCanvas.setColor(Color.BLUE);
        }

        // Redibujar el panel después de cualquier cambio
        panelCanvas.repaint();
    }
}
