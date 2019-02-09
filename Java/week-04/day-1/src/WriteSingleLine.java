import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"

    List<String> textWeWantToSave = new ArrayList<>();
    textWeWantToSave.add("My name is Michael. Hello there!");

    try {
      Path inputSource = Paths.get("source/my-file2.txt");
      Files.write(inputSource, textWeWantToSave);
      System.out.println("Write successful!");
    } catch (IOException ie) {
      System.out.println("Unable to write file: my-file2.txt");
    }
  }
}
