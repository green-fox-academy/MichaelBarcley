import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  // Create a function that takes 3 parameters: a path, a word and a number,
  // than it should write to a file.
  // The path parameter should be a string, that describes the location of the file.
  // The word parameter should be a string, that will be written to the file as lines
  // The number parameter should describe how many lines the file should have.
  // So if the word is "apple" and the number is 5, than it should write 5 lines
  // to the file and each line should be "apple"
  // The function should not raise any error if it could not write the file.
  public static void main(String[] args) {
    Path placeOfFile = Paths.get("source/WriteSingleLine-source.txt");
    String textInputToBeSaved = "They are taking the hobbits to Isengard!";
    int linesOfFiles = 6;
    writeIntoFile(placeOfFile, textInputToBeSaved, linesOfFiles);
  }

  public static void writeIntoFile(Path sourceParam, String textToBeSaved, int lineToBeSaved) {
    List<String> outputToFile = new ArrayList<>();
    for (int i = 0; i < lineToBeSaved; i++) {
      outputToFile.add(textToBeSaved);
    }
    try {

      Files.write(sourceParam, outputToFile);
      System.out.println("Command successful.");
    } catch (IOException ie) {
      System.out.println("Unknown error. Please contact God for help. See ya!");
    }
  }
}
