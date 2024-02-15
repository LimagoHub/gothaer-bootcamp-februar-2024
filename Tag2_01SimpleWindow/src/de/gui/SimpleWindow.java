package de.gui;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;

public class SimpleWindow extends Frame implements KeyListener {

    private static final int SIZE = 500;
    private String message = "Hallo Fenster";
    private int x,y;

    public SimpleWindow() {
        x = y = SIZE/2;
        addKeyListener(this);// Briefträger Bescheid sagen
        setSize(SIZE,SIZE);
        setVisible(true);// Immer der letzte
    }

    public static void main(String[] args) {
       new SimpleWindow();
    }

    @Override
    public void paint(final Graphics g) {
        g.drawString(message, 50,50);
        g.drawRect(x,y, 30,30);
    }

    @Override
    public void keyTyped(final KeyEvent e) {

    }

    @Override
    public void keyPressed(final KeyEvent e) { // Klingel anschrauben
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            dispose();
        }
        message = "Taste wurde gedrückt";
        repaint();
    }

    @Override
    public void keyReleased(final KeyEvent e) {

    }
}

