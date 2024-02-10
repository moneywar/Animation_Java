import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;

public class Tools {
    private static int stroke = 1;

    public static void BresenhamLineForCirlcleRun(Graphics g, Queue<Node> a, int speed, int x1, int y1, int x2, int y2) {
        float dx = Math.abs(x2 - x1);
        float dy = Math.abs(y2 - y1);

        float sx = (x1 < x2) ? speed : -speed;
        float sy = (y1 < y2) ? speed : -speed;

        boolean isSwap = false;
        if(dy > dx) {
            float tmp = dx;
            dx = dy;
            dy = tmp;

            isSwap = true;
        }

        float D = 2 * dy - dx;

        int x = x1;
        int y = y1;

        for(int i=1;i<dx;i++) {
            a.add(new Node(x, y));
            
            if(D >= 0) {
                if(isSwap) x += sx;
                else y += sy;

                D -= 2 * dx;
            }

            if(isSwap) y += sy;
            else x += sx;

            D += 2 * dy;
        }
    }

    public static void circle(Graphics2D g, BufferedImage bufferEffect, int h, int k, int r) {
        int x = 0;
        int y = r;
        int Dx = 2 * x;
        int Dy = 2 * y;
        int D = 1 - r;
        while(x <= y) {
            plot(g, x + h, y + k);
            plot(g,x + h, -y + k);
            plot(g,-x + h, y + k);
            plot(g,-x + h, -y + k);
            plot(g,y + h, x + k);
            plot(g,y + h, -x + k);
            plot(g,-y + h, x + k);
            plot(g,-y + h, -x + k);

            x += 1;
            Dx += 2;
            D += Dx + 1;
            if(D >= 0) {
                y = y - 1;
                Dy = Dy - 2;
                D = D - Dy;
            }
        }

        // Tools.floodFill(g, bufferEffect, h, k, Color.WHITE);
    }

    public static void Ellipse(Graphics2D g2, int xc, int yc, int a, int b) {
        int a2 = a*a;
        int b2 = b*b;
        int twoA2 = 2 * a2;
        int twoB2 = 2 * b2;
        //Region 1
        int x = 0;
        int y = b;
        int D = Math.round(b2 - a2*b + a2/4);
        int Dx = 0;
        int Dy = twoA2*y;
        while(Dx <= Dy) {
            plot(g2, x + xc, y + yc);
            plot(g2, -x + xc, y + yc);
            plot(g2, x + xc, -y + yc);
            plot(g2, -x + xc, -y + yc);
            x += 1;
            Dx += twoB2;
            D += Dx + b2; 
            if(D >= 0) {
                y -= 1;
                Dy -= twoA2;
                D -= Dy;
            }
        }
        //Region 2
        x = a;
        y = 0;
        D = Math.round(a2 - b2*a + b2/4);
        Dx = twoB2*x;
        Dy = 0;
        while(Dx >= Dy) {
            plot(g2, x + xc, y + yc);
            plot(g2, -x + xc, y + yc);
            plot(g2, x + xc, -y + yc);
            plot(g2, -x + xc, -y + yc);
            y += 1;
            Dy += twoA2;
            D += Dy + a2; 
            if(D >= 0) {
                x -= 1;
                Dx -= twoB2;
                D -= Dx;
            }
        }
    }

    public static void cubicBezier(Graphics2D g2, int x1, int y1, int ctrlx1, int ctrly1, int ctrlx2, int ctrly2, int x2, int y2) {
        int x = x1;
        int y = y1;
        plot(g2, x, y);

        for (double t = 0; t <= 1; t += 0.0005) {
            x = (int) Math.round(Math.pow(1 - t, 3) * x1 + 3 * t * Math.pow(1 - t, 2) * ctrlx1
                    + 3 * t * t * (1 - t) * ctrlx2 + Math.pow(t, 3) * x2);
            y = (int) Math.round(Math.pow(1 - t, 3) * y1 + 3 * t * Math.pow(1 - t, 2) * ctrly1
                    + 3 * t * t * (1 - t) * ctrly2 + Math.pow(t, 3) * y2);
            plot(g2, x, y);
        }
    }

    public static void floodFill(Graphics2D g2, BufferedImage buffer, int x, int y, Color replaceColor) {
        Queue<Node> Q = new LinkedList<>();

        Color tagetColor = getPixelColorAt(buffer, x, y);
        paintColor(g2, x, y, replaceColor);
        Q.offer(new Node(x, y));

        while (!Q.isEmpty()) {
            Node current_Node = Q.poll();
            // System.out.println(current_Node.x + " " + current_Node.y);

            //South
            if(getPixelColorAt(buffer, current_Node.x, current_Node.y + 1).equals(tagetColor)) {
                paintColor(g2, current_Node.x, current_Node.y + 1, replaceColor);
                Q.add(new Node(current_Node.x, current_Node.y + 1));
            }
            //North
            if(getPixelColorAt(buffer, current_Node.x, current_Node.y - 1).equals(tagetColor)) {
                paintColor(g2, current_Node.x, current_Node.y - 1, replaceColor);
                Q.add(new Node(current_Node.x, current_Node.y - 1));
            }
            //East
            if(getPixelColorAt(buffer, current_Node.x + 1, current_Node.y).equals(tagetColor)) {
                paintColor(g2, current_Node.x + 1, current_Node.y, replaceColor);
                Q.add(new Node(current_Node.x + 1, current_Node.y));
            }
            //West
            if(getPixelColorAt(buffer, current_Node.x - 1, current_Node.y).equals(tagetColor)) {
                paintColor(g2, current_Node.x - 1, current_Node.y, replaceColor);
                Q.add(new Node(current_Node.x - 1, current_Node.y));
            }
        }
    }

    public static Color getPixelColorAt(BufferedImage buffer, int x, int y) {
        if(x >= 600 || y >= 600 || x<=0 || y<=0) return new Color(1,1,1);
        return new Color(buffer.getRGB(x, y));
    }

    public static void plot(Graphics2D g2, int x, int y) {
        g2.fillRect(x, y, stroke, stroke);
    }

    private static void paintColor(Graphics2D g2, int x, int y, Color color) {
        g2.setColor(color);
        g2.fillRect(x, y, 1, 1);
        // g2.setColor(new Color(0,0,1));
    }

    public static void setStroke(int s) {
        stroke = s;
    }
}
