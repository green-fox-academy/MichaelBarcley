import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    String placeOfOriginalFile = "source/reversed-lines.txt";
    System.out.println(reverseTheText(placeOfOriginalFile));
  }

  public static List<String> reverseTheText(String sourceLocation) {
    try {
      List<String> originalText = Files.readAllLines(Paths.get(sourceLocation));
      List<String> readableText = new ArrayList<>();
      for (int i = 0; i < originalText.size(); i++) {
        String tempReverse = "";
        for (int j = 0; j <= originalText.get(i).length() - 1; j++) {
          tempReverse += originalText.get(i).charAt(originalText.get(i).length() - j - 1);
        }
        readableText.add(tempReverse);
      }
      return readableText;

    } catch (IOException ie) {
      System.out.println("Problem with the file!");
      return null;
    }
  }
}