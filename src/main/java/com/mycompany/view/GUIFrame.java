/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*GUIFrame = contenedor dentro de una interfaz gráfica de usuario*/
package com.mycompany.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class GUIFrame extends JFrame {
    private PanelCanvas panelCanvas;
    private PanelColor panelColor;
    private PanelMove panelMove;

    public GUIFrame() {
        this.panelCanvas = new PanelCanvas();
        this.panelColor = new PanelColor();
        this.panelMove = new PanelMove();

        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Canvas and Control");

        this.setLayout(new BorderLayout());
        this.add(panelCanvas, BorderLayout.CENTER);
        this.add(panelColor, BorderLayout.NORTH);
        this.add(panelMove, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public PanelCanvas getPanelCanvas() {
        return panelCanvas;
    }

    public PanelColor getPanelColor() {
        return panelColor;
    }

    public PanelMove getPanelMove() {
        return panelMove;
    }
}

