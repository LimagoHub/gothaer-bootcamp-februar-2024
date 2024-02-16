package de.gothaer.paintclone;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class PaintClone extends Frame {


    public enum Form {LINIE,RECHTECK,OVAL,LOESCHEN};
    private static final int SIZE = 1000;
    private final BufferedImage image = new BufferedImage(SIZE,SIZE, BufferedImage.TYPE_INT_RGB);

    private Form form = Form.LINIE;
    private Color farbe = Color.WHITE;

    public Form getForm() {
        return form;
    }

    public void setForm(final Form form) {
        this.form = form;
    }

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(final Color farbe) {
        this.farbe = farbe;
    }

    public PaintClone()  {
        super("PaintClone Version 1.0");
        setResizable(false);
        setBackground(Color.BLACK);
        MyMenuBar menuBar = new MyMenuBar(this);
        setSize(SIZE,SIZE);
        setMenuBar(menuBar);
        addMouseListener(new MyMouseListener());
    }

    @Override
    public void paint(final Graphics g) {
        g.drawImage(image,0,0,this);
    }

    public static void main(String[] args) {
        new PaintClone().setVisible(true);
    }

    class MyMouseListener extends MouseAdapter {

        private int x,  y;
        @Override
        public void mousePressed(final MouseEvent e) {
            x = e.getX();
            y = e.getY();
        }

        @Override
        public void mouseReleased(final MouseEvent e) {
            Graphics g = image.getGraphics();
            g.setColor(getFarbe());
            switch (getForm()) {
                case LINIE -> g.drawLine(x,y,e.getX(),e.getY());
                case RECHTECK -> g.drawRect(x,y,e.getX()-x,e.getY()-y);
                case OVAL -> g.drawOval(x,y,e.getX()-x,e.getY()-y);
                case LOESCHEN -> g.clearRect(x,y,e.getX()-x,e.getY()-y);
            }
            g.dispose();
            repaint();
        }
    }
}