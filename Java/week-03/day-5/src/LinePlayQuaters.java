import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuaters {
    public static void mainDraw(Graphics graphics) {
        int linesHowDense = 14;
        drawForm(graphics, linesHowDense);
    }

    public static void drawForm(Graphics graphics, int density) {
        int quatersSplit = 4; //This number will result x^2 amount of draws!
        int y1 = 0;
        int x2 = 0;

        for (int k = 0; k < quatersSplit; k++) {
            for (int j = 0; j < quatersSplit; j++) {
                for (int i = 0; i < density; i++) {
                    y1 = i * HEIGHT / (density - 1);
                    x2 = i * WIDTH / (density - 1);
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine(j * WIDTH / quatersSplit, (y1 / quatersSplit) + (k * HEIGHT/quatersSplit), (x2 / quatersSplit) + (j * HEIGHT/quatersSplit), (HEIGHT / quatersSplit) + (k * HEIGHT / quatersSplit));
                    graphics.setColor(new Color(168, 0, 224));
                    graphics.drawLine((WIDTH / quatersSplit) + (j * WIDTH / quatersSplit), (y1 / quatersSplit) + (k * HEIGHT/quatersSplit), (x2 / quatersSplit) + (j * HEIGHT/quatersSplit), k * HEIGHT / quatersSplit);
                }
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