import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
    String pathOfOriginalFile = "source/reversed-order.txt";
    System.out.println(reverseLineOrder(pathOfOriginalFile));
  }

  public static List<String> reverseLineOrder(String sourceLocation) {
    try {
      List<String> originalText = Files.readAllLines(Paths.get(sourceLocation));
      List<String> orderedText = new ArrayList<>();

      for (int i = originalText.size() - 1; i >= 0; i--) {
        orderedText.add(originalText.get(i));
      }

      return orderedText;
    } catch (IOException ie) {
      System.out.println("Problem with the file!");
      return null;
    }
  }
}