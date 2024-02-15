package de.gui;

import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;

public class SimpleWindow extends Frame  {

    private static final int SIZE = 500;
    private String message = "Hallo Fenster";
    private int x,y;

    public SimpleWindow() {
        x = y = SIZE/2;
        addKeyListener(new MyKeyListener());// Briefträger Bescheid sagen
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent e) {
                dispose();
            }
        });
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





    class MyKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(final KeyEvent e) {
            final int step = 5;
            switch (e.getKeyCode()) {
                case KeyEvent.VK_ESCAPE -> dispose();
                case KeyEvent.VK_UP-> y-=step;
                case KeyEvent.VK_DOWN-> y+=step;
                case KeyEvent.VK_LEFT-> x-=step;
                case KeyEvent.VK_RIGHT-> x+=step;

            }
            message = "Taste wurde gedrückt";
            repaint();
        }
    }

    /*class MyWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(final WindowEvent e) {
           dispose();
        }
    }
    */

}

