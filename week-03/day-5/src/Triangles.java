import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int howManyRows = 4;
        triangleDrawer(graphics, howManyRows);
    }

    public static void triangleDrawer(Graphics graphics, int rows) {
        int size = WIDTH / rows;
        int[] xCoord = {0, size, size / 2};
        int[] yCoord = {HEIGHT, HEIGHT, HEIGHT - HEIGHT / rows};

        for (int i = 0; i < HEIGHT / size; i++) {
            for (int j = 0; j < WIDTH / size - i; j++) {
                graphics.drawPolygon(xCoord, yCoord, 3);
                xCoord[0] += size;
                xCoord[1] += size;
                xCoord[2] += size;
            }
            yCoord[0] -= size;
            xCoord[0] = (i + 1) * size / 2;
            yCoord[1] -= size;
            xCoord[1] = xCoord[0] + size;
            yCoord[2] -= size;
            xCoord[2] = (xCoord[0] + xCoord[1]) / 2;
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