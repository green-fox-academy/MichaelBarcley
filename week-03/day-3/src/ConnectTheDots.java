import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] coordinates = new int[][]{
                {10, 10},
                {290, 10},
                {290, 290},
                {10, 290}
        };
        int[][] coordinates2 = new int[][]{{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                {120, 100}, {85, 130}, {50, 100}};
        drawIt(graphics, coordinates);
        drawIt(graphics, coordinates2);
    }

    public static void drawIt(Graphics g, int[][] data) {
        g.setColor(Color.GREEN);
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data[0].length - 1; j++) {
                g.drawLine(data[i][j], data[i][j + 1], data[i + 1][j], data[i + 1][j + 1]);
            }
        }
        g.drawLine(data[data.length-1][0], data[data.length-1][1], data[0][0], data[0][1]);
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