package de.gui;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleWindow extends Frame implements KeyListener {

    private String message = "Hallo Fenster";

    public SimpleWindow() {
        addKeyListener(this);// Briefträger Bescheid sagen
        setSize(300,300);
        setVisible(true);// Immer der letzte
    }

    public static void main(String[] args) {
       new SimpleWindow();
    }

    @Override
    public void paint(final Graphics g) {
        g.drawString(message, 50,50);

    }

    @Override
    public void keyTyped(final KeyEvent e) {

    }

    @Override
    public void keyPressed(final KeyEvent e) { // Klingel anschrauben
        message = "Taste wurde gedrückt";
        repaint();
    }

    @Override
    public void keyReleased(final KeyEvent e) {

    }
}

