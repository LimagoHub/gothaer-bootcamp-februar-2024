package de.games;

import java.awt.*;

public class Ball {
    private Rectangle rectangle;
    private int xRichtung=2, yRichtung=1;

    public Ball(int x, int y, int breite, int hoehe) {
        rectangle = new Rectangle(x,y, breite, hoehe);
    }

    public void render(Graphics g) {
        g.setColor(Color.RED);

        g.fillOval(rectangle.x-10, rectangle.y-10, rectangle.width, rectangle.height);
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(final Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public int getxRichtung() {
        return xRichtung;
    }

    public void setxRichtung(final int xRichtung) {
        this.xRichtung = xRichtung;
    }

    public int getyRichtung() {
        return yRichtung;
    }

    public void setyRichtung(final int yRichtung) {
        this.yRichtung = yRichtung;
    }
}
