import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    String placeOfFile = "source/duplicated-chars.txt";
    removeDuplicatedChars(placeOfFile);
  }

  public static void removeDuplicatedChars(String filePlace) {
    try {
      Path filePath = Paths.get(filePlace);
      List<String> OriginalText = Files.readAllLines(filePath);
      List<String> removedDuplicated = new ArrayList<>();
      for (int h = 0; h < OriginalText.size() - 1; h++) {
        String myText = "";
        for (int i = 0; i < OriginalText.get(h).length() - 1; i++) {
          if (i % 2 == 0) {
            myText += OriginalText.get(h).charAt(i + 1);
          }
        }
        removedDuplicated.add(myText);
      }
      System.out.println(removedDuplicated);
    } catch (IOException ie) {
      System.out.println("Problem with the file!");
    }
  }
}