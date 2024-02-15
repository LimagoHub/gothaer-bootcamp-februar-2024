package de.gui;

import java.awt.*;

public class Linie extends Frame {

    private static final int SIZE = 500;
    private int x1,x2,y1,y2;

    public Linie() throws HeadlessException {
        x1 = x2 = y1 = y2 = -1;
        setSize(SIZE,SIZE);

    }

    public static void main(String[] args) {
        new Linie().setVisible(true);
    }

    @Override
    public void paint(final Graphics g) {
        g.drawLine(x1,y1,x2,y2);
    }
}