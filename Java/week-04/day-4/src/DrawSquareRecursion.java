import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawSquareRecursion {
  public static void mainDraw(Graphics g) {
    squareRecursion(g, 5, 0, 0, WIDTH, HEIGHT);
  }

  public static void squareRecursion(Graphics g, int repeats, int xStart, int yStart, int width, int height) {
    if (repeats == 0) {
      g.drawRect(0, 0, WIDTH, HEIGHT);
    } else {
      g.drawRect(xStart, yStart, width, height);
      squareRecursion(g, repeats - 1, xStart + width / 3, yStart, width / 3, height / 3);
      squareRecursion(g, repeats - 1, xStart, yStart + height / 3, width / 3, height / 3);
      squareRecursion(g, repeats - 1, xStart + width / 3 * 2, yStart + height / 3, width / 3, height / 3);
      squareRecursion(g, repeats - 1, xStart + width / 3, yStart + width / 3 * 2, width / 3, height / 3);
    }
  }

  static int WIDTH = 729;
  static int HEIGHT = 729;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
    panel.setBackground(Color.YELLOW);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
