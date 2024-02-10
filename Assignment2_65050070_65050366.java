import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Assignment2_65050070_65050366 extends JPanel implements Runnable {
    double sec = 0;
    int state = 0;
    int delay = 33;

    // Save drew buffer
    boolean isDraw = false;
    BufferedImage[] digda = new BufferedImage[3];
    BufferedImage evoDigdaBuffer;

    // TextBox Object
    TextBox before = new TextBox("What?", "Digda is evolving!");
    TextBox after = new TextBox("Congratulation! Your Digda", "evolved into GIGA digda");

    BufferedImage backgroundBuffer; // Background and Pokemon buffer

    pokemonChangeState change = new pokemonChangeState();

    public static void main(String[] args) {
        Assignment2_65050070_65050366 m = new Assignment2_65050070_65050366();

        JFrame panel = new JFrame();
        panel.add(m);
        panel.setTitle("Assignment2");
        panel.setSize(700, 700);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);

        (new Thread(m)).start();
    }

    public void paintComponent(Graphics g) {
        if(!isDraw) return;
        // Choose pokemon to draw in this frame
        BufferedImage drawBuffer = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);

        // Effect buffer
        BufferedImage bufferEffect = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2Effect = bufferEffect.createGraphics();

        // Set Effect outline color
        g2Effect.setColor(Color.WHITE);

        // State Changer
        if (state == 0) { // text and before evo pokemon
            drawBuffer = digda[0];
        } else if (state == 1) { // pokemon animation
            drawBuffer = change.beforeEvo(digda);
        } else if (state == 2) { // pokemon evolution animation and particle
            background.CreateCircleParticle(g2Effect);
            background.simulateParticle(g2Effect, bufferEffect);
            drawBuffer = change.elolution(digda[0], evoDigdaBuffer);
        } else if (state == 3) { // pokemon evolution faster
            background.simulateParticle(g2Effect, bufferEffect);
            drawBuffer = change.elolution(digda[0], evoDigdaBuffer);
        } else if (state == 4) { // boom animation out
            drawBuffer = digda[0];
            background.boomEffect(g2Effect, bufferEffect, false);
        } else if (state == 5) { // boom animation in
            drawBuffer = evoDigdaBuffer;
            background.boomEffect(g2Effect, bufferEffect, true);
        } else if (state == 6) { // text and after evolution
            drawBuffer = evoDigdaBuffer;
        }

        if (state == 4 || state == 5) { // Make particle over pokemon in state 4 and 5
            g.drawImage(backgroundBuffer, 0, 0, null);
            g.drawImage(drawBuffer, 0, 0, null);
            g.drawImage(bufferEffect, 0, 0, null);
        } else {
            g.drawImage(backgroundBuffer, 0, 0, null);
            g.drawImage(bufferEffect, 0, 0, null);
            g.drawImage(drawBuffer, 0, 0, null);
        }

        // TextBox
        // Make Textbox over every layer
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.GREEN);
        g2.fillRoundRect(0, 440, 600, 160, 20, 20);
        g2.setColor(Color.BLACK);
        g2.drawRoundRect(0, 440, 600, 160, 20, 20);
        if (state < 6) {
            before.text(g2);
        } else if (state >= 6) {
            after.text(g2);
        }
    }

    @Override
    public void run() {
        // Draw pokemon to save in buffer one time
        digda[0] = drawPokemon.digda1();
        System.out.println("Finish1");

        digda[1] = drawPokemon.digda2();
        System.out.println("Finish2");

        digda[2] = drawPokemon.digda3();
        System.out.println("Finish3");

        evoDigdaBuffer = drawPokemon.evodigda();
        System.out.println("Finish!!");

        backgroundBuffer = background.drawBackground();

        isDraw = true; // Make paintComponent can process after draw all buffer

        // Set Time variable
        double lastTime = System.currentTimeMillis();
        double currentTime, elapsedTime;


        while (true) {
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;
            lastTime = currentTime;
            sec += elapsedTime / 1000.0;

            // State changer (change state and delay time for faster or slower animation)
            switch (state) {
                case 0:
                    if (sec > 3)
                        state = 1;
                    delay = 22; 
                    break;
                case 1:
                    if (sec > 4.5)
                        state = 2;
                    delay = 250;
                    break;
                case 2:
                    if (sec > 8)
                        state = 3;
                    delay = 33;
                    break;
                case 3:
                    if (sec > 10.5)
                        state = 4;
                    delay = 10;
                    break;
                case 4:
                    if (sec > 12)
                        state = 5;
                    delay = 0;
                    break;
                case 5:
                    if (sec > 13.5)
                        state = 6;
                    delay = 0;
                    break;
                case 6:
                    if (sec > 15)
                        state = 7;
                    delay = 22;
                    break;
                default:
                    break;
            }
            if (state == 7) {
                break;
            }

            repaint();

            try {
                Thread.sleep(delay);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}