import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  // Write a function that takes a filename as string,
  // then returns the number of lines the file contains.
  // It should return zero if it can't open the file, and
  // should not raise any error.
  
  public static void main(String[] args) {
    System.out.println("Rows in the opened file: " + countLinesInFile());
  }

  public static int countLinesInFile() {
    int lineCounter = 0;
    try {
      Path inputSource = Paths.get("source/my-file.txt");
      List<String> readTheFile = Files.readAllLines(inputSource);
      lineCounter = readTheFile.size();
    } catch (IOException ie) {
    }
    return lineCounter;
  }
}
