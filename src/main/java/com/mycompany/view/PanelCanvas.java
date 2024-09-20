package com.mycompany.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PanelCanvas extends JPanel {
    private int x;
    private int y;
    private Color currentColor;  // Variable para el color actual de la figura
    
    public PanelCanvas() {
        this.x = 20;  // Posición inicial de la figura
        this.y = 20;
        this.currentColor = Color.RED;  // Color inicial de la figura
        
        // Asignar las teclas de movimiento
        controlTeclado("UP", "moveUp", () -> moveUp());
        controlTeclado("DOWN", "moveDown", () -> moveDown());
        controlTeclado("LEFT", "moveLeft", () -> moveLeft());
        controlTeclado("RIGHT", "moveRight", () -> moveRight());

        // Asignar teclas para cambiar de color
        controlTeclado("R", "setColorRed", () -> setColor(Color.RED));
        controlTeclado("G", "setColorGreen", () -> setColor(Color.GREEN));
        controlTeclado("B", "setColorBlue", () -> setColor(Color.BLUE));
        }

    // Método para asociar teclas a acciones
    private void controlTeclado(String key, String actionName, Runnable action) {
        this.getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(key), actionName);
        this.getActionMap().put(actionName, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action.run();
            }
        });
      }
    
    // Método para cambiar el color
    public void setColor(Color color) {
        this.currentColor = color;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Usar el color actual para dibujar la figura
        g.setColor(currentColor);
        g.fillOval(this.x, this.y, 20, 20);  // Dibujar un círculo en las coordenadas (x, y)
    }

    // Métodos para mover la figura
    public void moveUp() {
        int moveDistance = 10;
        if (y - moveDistance >= 0) {
            y -= moveDistance;
        }
        repaint();  // Redibuja el panel
    }

    public void moveDown() {
        int moveDistance = 10;
        if (y + moveDistance + 20 <= getHeight()) {
            y += moveDistance;
        }
        repaint();
    }

    public void moveLeft() {
        int moveDistance = 10;
        if (x - moveDistance >= 0) {
            x -= moveDistance;
        }
        repaint();
    }

    public void moveRight() {
        int moveDistance = 10;
        if (x + moveDistance + 20 <= getWidth()) {
            x += moveDistance;
        }
        repaint();
    }
    
}
