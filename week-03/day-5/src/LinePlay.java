import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        int density = 14;
        int y1 = 0;
        int x2 = 0;

        graphics.setColor(Color.GREEN);
        for (int i = 0; i < density; i++) {
            y1 = i * HEIGHT / (density - 1);
            x2 = i * WIDTH / (density - 1);
            graphics.drawLine(0, y1, x2, HEIGHT);
        }

        graphics.setColor(new Color(168, 0, 224));
        for (int i = 0; i < density; i++) {
            y1 = i * HEIGHT / (density - 1);
            x2 = i * WIDTH / (density - 1);
            graphics.drawLine(WIDTH, y1, x2, 0);
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