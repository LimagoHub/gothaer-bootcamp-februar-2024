package de.gothaer.paintclone;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PaintClone extends Frame {

    private static final int SIZE = 1000;
    //private final BufferedImage image = new BufferedImage(SIZE,SIZE, BufferedImage.TYPE_INT_RGB);

    public PaintClone()  {
        super("PaintClone Version 1.0");
        setSize(SIZE,SIZE);
        setMenuBar(new MyMenuBar());
    }

    public static void main(String[] args) {
        new PaintClone().setVisible(true);
    }
}