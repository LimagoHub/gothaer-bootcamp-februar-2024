package de.gui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

public class Linie extends Frame {

    private static final int SIZE = 500;
    private BufferedImage image = new BufferedImage(SIZE,SIZE, BufferedImage.TYPE_INT_RGB);

    public Linie() throws HeadlessException {
        setResizable(false);
        setBackground(Color.BLACK);
        setSize(SIZE,SIZE);
        addMouseListener(new MyMouseListener());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Linie().setVisible(true);
    }

    @Override
    public void paint(final Graphics g) {
        g.drawImage(image,0,0, this);
    }

    class MyMouseListener extends MouseAdapter {
        private int x, y;
        @Override
        public void mousePressed(final MouseEvent e) {
            x = e.getX();
            y = e.getY();
        }

        @Override
        public void mouseReleased(final MouseEvent e) {
            Graphics schattenfenster = image.getGraphics();
            schattenfenster.drawLine(x,y, e.getX(),e.getY());
            schattenfenster.dispose();
            repaint();
        }
    }
}