import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    static int size = 20;
    static int h = (int) (Math.sqrt(Math.pow(size, 2) - Math.pow(size / 2, 2)));

    public static void mainDraw(Graphics graphics) {
        hexagonGrid(graphics);
    }

    public static void basicHexagon(Graphics g, int xStart, int yStart) {
        int[] xCoord = {xStart, xStart + size, xStart + 3 * size / 2, xStart + size, xStart, xStart - size / 2};
        int[] yCoord = {yStart, yStart, yStart - h, yStart - 2 * h, yStart - 2 * h, yStart - h};
        g.drawPolygon(xCoord, yCoord, 6);
    }

    public static void hexagonGrid(Graphics g) {
        int initialX = (WIDTH - 10 * size) / 2;
        int initialY = HEIGHT / 2 + 4 * h;

        for (int i = -3; i < 4; i++) {
            for (int j = 0; j < 7 - Math.abs(i); j++) {
                int nextHexagonStartX = initialX + (i + 3) * 3 * size / 2;
                int nextHexagonStartY = initialY + (3 - Math.abs(i)) * h - j * 2 * h;
                basicHexagon(g, nextHexagonStartX, nextHexagonStartY);
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}