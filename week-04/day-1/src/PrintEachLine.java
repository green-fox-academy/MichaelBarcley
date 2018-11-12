import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of the lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"

    try {
      Path inputSource = Paths.get("source/my-file.txt");
      List<String> readInput = Files.readAllLines(inputSource);
      System.out.println(readInput);
    } catch (IOException ie) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}