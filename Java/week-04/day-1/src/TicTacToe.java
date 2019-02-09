import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file

    System.out.println(ticTacResult("source/win-o.txt"));
    // Should print "O"

    System.out.println(ticTacResult("source/win-x.txt"));
    // Should print "X"

    System.out.println(ticTacResult("source/draw.txt"));
    // Should print "Draw"
  }

  public static String ticTacResult(String pathOfGame) {
    String result = "Draw";
    try {
      List<String> readTheFile = Files.readAllLines(Paths.get(pathOfGame));
      
      if ((readTheFile.get(0).contains("OOO")) || (readTheFile.get(1).contains("OOO")) || (readTheFile.get(2)).contains("OOO")) {
        result = "O";
      } else if ((readTheFile.get(0).substring(0,1).equals("O")) && (readTheFile.get(1).substring(1,2).equals("O")) && (readTheFile.get(2).substring(2,3).equals("O"))) {
        result = "O";
      } else if ((readTheFile.get(0).substring(2,3).equals("O")) && (readTheFile.get(1).substring(1,2).equals("O")) && (readTheFile.get(2).substring(0,1).equals("O"))) {
        result = "O";
      } else if ((readTheFile.get(0).startsWith("O")) && (readTheFile.get(1).startsWith("O")) && (readTheFile.get(2).startsWith("O"))) {
        result = "O";
      } else if ((readTheFile.get(0).substring(1,2).equals("O")) && (readTheFile.get(1).substring(1,2).equals("O")) && (readTheFile.get(2).substring(1,2).equals("O"))) {
        result = "O";
      } else if ((readTheFile.get(0).endsWith("O")) && (readTheFile.get(1).endsWith("O")) && (readTheFile.get(2).endsWith("O"))) {
        result = "O";
      }

      if ((readTheFile.get(0).contains("XXX")) || (readTheFile.get(1).contains("XXX")) || (readTheFile.get(2)).contains("XXX")) {
        result = "X";
      } else if ((readTheFile.get(0).substring(0,1).equals("X")) && (readTheFile.get(1).substring(1,2).equals("X")) && (readTheFile.get(2).substring(2,3).equals("X"))) {
        result = "X";
      } else if ((readTheFile.get(0).substring(2,3).equals("X")) && (readTheFile.get(1).substring(1,2).equals("X")) && (readTheFile.get(2).substring(0,1).equals("X"))) {
        result = "X";
      } else if ((readTheFile.get(0).startsWith("X")) && (readTheFile.get(1).startsWith("X")) && (readTheFile.get(2).startsWith("X"))) {
        result = "X";
      } else if ((readTheFile.get(0).substring(1,2).equals("X")) && (readTheFile.get(1).substring(1,2).equals("X")) && (readTheFile.get(2).substring(1,2).equals("X"))) {
        result = "X";
      } else if ((readTheFile.get(0).endsWith("X")) && (readTheFile.get(1).endsWith("X")) && (readTheFile.get(2).endsWith("X"))) {
        result = "X";
      }

      return result;
    } catch (IOException ie) {
      System.out.println("Could not read input file.");
      return null;
    }
  }
}