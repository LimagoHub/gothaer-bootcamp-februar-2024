package de.games;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.time.Duration;
import java.time.Instant;

public class BouncingBall extends Frame {

    private BufferStrategy strategy;
    private static final int SIZE =1000;
    private Ball ball;

    private boolean gameover = false;
    public BouncingBall()  {
        super("Bouncing Ball");
        ball = new Ball(SIZE/2,SIZE/2, 20,20);
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
        ball.getRectangle().x += ball.getxRichtung();
        ball.getRectangle().y += ball.getyRichtung();
        if( ball.getRectangle().x < 0 || ball.getRectangle().x > getWidth())
            ball.setxRichtung(ball.getxRichtung() * -1);

        if( ball.getRectangle().y < 0 || ball.getRectangle().y > getHeight())
            ball.setyRichtung(ball.getyRichtung() * -1);
    }

    private void renderScene() {
        Graphics g = strategy.getDrawGraphics();

        g.clearRect(0, 0, getWidth(), getHeight());
        //g.setXORMode(Color.BLUE);
        ball.render(g);
        g.dispose();
        strategy.show();
    }
}