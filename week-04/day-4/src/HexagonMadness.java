import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexagonMadness {

  public static void mainDraw(Graphics graphics) {
    hexagon(graphics, 150, HEIGHT - 50, 300);
  }

  public static void hexagon(Graphics g, int xStart, int yStart, int size) {
    int h = (int) (size / 2 * Math.sqrt(3));
    int[] xCoord = {xStart, xStart + size, xStart + 3 * size / 2, xStart + size, xStart, xStart - size / 2};
    int[] yCoord = {yStart, yStart, yStart - h, yStart - 2 * h, yStart - 2 * h, yStart - h};

    if (size < 5) {
    } else {
      g.drawPolygon(xCoord, yCoord, 6);
      hexagon(g, xStart, yStart, size / 2);
      hexagon(g, xStart, yStart - h, size / 2);
      hexagon(g, xStart + size * 3 / 4, yStart - h / 2, size / 2);
    }
  }

  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
