package de.games;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.time.Duration;
import java.time.Instant;

public class BouncingBall extends Frame {

    private BufferStrategy strategy;
    private static final int SIZE =1000;
    private int x,y;
    private int xRichtung, yRichtung;

    private boolean gameover = false;
    public BouncingBall()  {
        super("Bouncing Ball");
        x = y = SIZE/2;
        xRichtung = 2;
        yRichtung = 1;
        setSize(SIZE,SIZE);
        setVisible(true);
        createBufferStrategy(2);
        strategy = getBufferStrategy();
    }

    public static void main(String[] args) {
        new BouncingBall().run();
    }

    private void run() {
        try {
            while(! gameover) {
                //var start = Instant.now();
                calculateScene();
                renderScene();
                //var ende = Instant.now();
                //var duration = Duration.between(start,ende).toMillis();
                //Thread.sleep(10);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void calculateScene() {
        x += xRichtung;
        y += yRichtung;
        if( x < 0 || x > getWidth())
            xRichtung *= -1;

        if( y < 0 || y > getHeight())
            yRichtung *= -1;
    }

    private void renderScene() {
        Graphics g = strategy.getDrawGraphics();
        g.setColor(Color.RED);
        g.clearRect(0, 0, getWidth(), getHeight());
        g.fillOval(x-10, y-10, 20, 20);
        g.dispose();
        strategy.show();
    }
}