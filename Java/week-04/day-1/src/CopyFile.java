import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  // Write a function that copies a file to an other
  // It should take the filenames as parameters
  // It should return a boolean that shows if the copy was successful

  public static void main(String [] args) {
    Path input = Paths.get("source/WriteSingleLine-source.txt");
    Path output = Paths.get("source/CopyFile-source.txt");
    System.out.println(copyFile(input, output));
  }

  public static boolean copyFile (Path source, Path output) {
    boolean successful = false;
    try {
      List<String> tempStoreOfText = Files.readAllLines(source);
      Files.write(output, tempStoreOfText);
      successful = true;
    } catch (IOException ie) {
    }
    return successful;
  }
}
