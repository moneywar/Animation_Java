import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class background {
    private static ArrayList<particle> a = new ArrayList<>();

    private static int circleboomSize = 0;

    // Not use
    // public void beam(Graphics2D g2) {
    //     AffineTransform a = new AffineTransform(1, 0, 0, 1, 300, 300);
    //     AffineTransform b = new AffineTransform(2, 0, 0, 2, 0, 0);
    //     AffineTransform c = new AffineTransform(Math.cos(angle), Math.sin(angle), -Math.sin(angle), Math.cos(angle), 0,
    //             0);
    //     AffineTransform d = new AffineTransform(1, 0, 0, 1, -300, -300);

    //     AffineTransform result = new AffineTransform();
    //     result.concatenate(a);
    //     result.concatenate(b);
    //     result.concatenate(c);
    //     result.concatenate(d);

    //     g2.setTransform(result);

    //     g2.drawLine(300, 300, 0, 275);
    //     g2.drawLine(300, 300, 0, 325);

    //     g2.drawLine(300, 300, 275, 0);
    //     g2.drawLine(300, 300, 325, 0);

    //     g2.drawLine(300, 300, 600, 275);
    //     g2.drawLine(300, 300, 600, 325);

    //     g2.drawLine(300, 300, 275, 600);
    //     g2.drawLine(300, 300, 325, 600);

    //     angle += 5;
    // }

    public static BufferedImage drawBackground() {
        BufferedImage buffer = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = buffer.createGraphics();

        // start color(Max 255)
        double red = 103;
        double green = 156;
        double blue = 132;

        // end color(Max 255)
        double endRed = 231;
        double endGreen = 231;
        double endBlue = 231;

        // grow rate of color
        double rateRed = (endRed - red) / 600;
        double rateGreen = (endGreen - green) / 600;
        double rateBlue = (endBlue - blue) / 600;

        for (int Pixel = 1; Pixel < 600 + 1; Pixel++) {
            red += rateRed;
            green += rateGreen;
            blue += rateBlue;
            Color gradientColor = new Color((int) red, (int) green, (int) blue);
            g.setColor(gradientColor);

            g.fillRect(0, Pixel, 600, 1);
        }

        return buffer;
    }

    public static void boomEffect(Graphics2D g2, BufferedImage bufferEffect, boolean isReduce) {
        if(circleboomSize > 450) circleboomSize = 450;
        if(circleboomSize < 0) return;
        if(isReduce) {
            Tools.circle(g2, bufferEffect, 300, 300, circleboomSize);
            Tools.floodFill(g2, bufferEffect, 300, 300, Color.WHITE);
            circleboomSize -= 30;
        }
        else {
            Tools.circle(g2, bufferEffect, 300, 300, circleboomSize);
            Tools.floodFill(g2, bufferEffect, 300, 300, Color.WHITE);
            circleboomSize += 30;
        }
    }

    public static void CreateCircleParticle(Graphics2D g2) {
        int min = 0;
        int max = 600;
        int x;
        int y;

        int runSide = (int) (Math.random() * 4);
        switch (runSide) {
            case 0:
                x = min + (int) (Math.random() * ((max - min) + 1));
                y = 0;
                break;
            case 1:
                x = min + (int) (Math.random() * ((max - min) + 1));
                y = 600;
                break;
            case 2:
                x = 0;
                y = min + (int) (Math.random() * ((max - min) + 1));
                break;
            case 3:
                x = 600;
                y = min + (int) (Math.random() * ((max - min) + 1));
                break;
            default:
                x = 0;
                y = 0;
                break;
        }
        particle newCircle = new particle();
        Tools.BresenhamLineForCirlcleRun(g2, newCircle.path, 20, 300, 300, x, y);
        a.add(newCircle);
    }

    public static void simulateParticle(Graphics2D g2, BufferedImage bufferEffect) {
        Iterator<particle> iterator = a.iterator();

        while (iterator.hasNext()) {
            particle curParticle = iterator.next();
            Node curNode = curParticle.path.poll();
            if (curParticle.path.isEmpty() || curNode.x >= 600 || curNode.y >= 600 || curNode.x <= 0 || curNode.y <= 0) {
                iterator.remove();
                continue;
            }
            Tools.circle(g2, bufferEffect, curNode.x, curNode.y, 10);
            Tools.floodFill(g2, bufferEffect, curNode.x, curNode.y, Color.WHITE);
        }
    }
}

class particle {
    Queue<Node> path = new LinkedList<>();
}

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}