import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
    public static void mainDraw(Graphics graphics) {
        drawTree(graphics, 9, WIDTH / 2, HEIGHT - 150, WIDTH / (maxSizeRatio - minSizeRatio), iAteMyPie);
    }

    public static void drawTree(Graphics g, int recursionLevel, int xStart, int yStart, double lineLength, double angle) {
        int xEnd = (int) (xStart + Math.sin(angle) * lineLength);
        int yEnd = (int) (yStart + Math.cos(angle) * lineLength);
        double changeLength = 0.85;

        g.setColor(new Color((int) (Math.random() * 190), 140 + (int) (Math.random() * 115), (int) (Math.random() * 190)));
        g.drawLine(xStart, yStart, xEnd, yEnd);

        if (recursionLevel > 1) {
            drawTree(g, recursionLevel - 1, xEnd, yEnd, lineLength * changeLength, angle);
            drawTree(g, recursionLevel - 1, xEnd, yEnd, lineLength * changeLength, angle + rotateTree);
            drawTree(g, recursionLevel - 1, xEnd, yEnd, lineLength * changeLength, angle - rotateTree);
        }
    }

    static double iAteMyPie = Math.PI;
    static double rotateTree = Math.PI / 8;
    static int minSizeRatio = 0;
    static int maxSizeRatio = 12;

    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        double seconds = 0;
        while (seconds < 600) {
            ImagePanel panel = new ImagePanel();
            panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            jFrame.add(panel);
            jFrame.setLocationRelativeTo(null);
            jFrame.pack();
            panel.setBackground(Color.BLACK);
            minSizeRatio = 0 + (int) (Math.random() * 4);

            seconds += 0.5;
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println("Process has been interrupted by user.");
            }
        }
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
