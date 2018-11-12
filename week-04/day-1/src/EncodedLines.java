import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EncodedLines {
  public static void main(String[] args) {
    String fileLocation = "source/encoded-lines.txt";
    System.out.println(readFileIn(fileLocation));
  }

  public static String readFileIn(String sourceLocation) {
    try {
      List<String> content = Files.readAllLines(Paths.get(sourceLocation));
      return decrypt(content);
    } catch (IOException e) {
      System.out.println("Problem handling the input file.");
      return null;
    }
  }

  public static String decrypt(List<String> encrypted) {
    String text = stringArrayToString(encrypted);
    char[] decryptedChars = asciiTransformer(stringOrCharTransformer(text));
    return charArrayToString(decryptedChars);
  }

  public static String stringArrayToString(List<String> list) {
    String text = "";

    for (String element : list) {
      text += element + "\n";
    }
    return text;
  }

  public static String charArrayToString(char... letter) {
    String sentence = new String(letter);
    return sentence;

  }

  public static char[] stringOrCharTransformer(String sentence) {
    String[] letters;
    letters = (sentence.split(""));
    char[] characters = new char[sentence.length()];

    for (int i = 0; i < letters.length; i++) {
      characters[i] = (letters[i].charAt(0));
    }
    return characters;
  }

  public static char[] asciiTransformer(char[] letterArray) {
    for (int i = 0; i < letterArray.length; i++) {
      if (letterArray[i] != ' ' && letterArray[i] != '\n') {
        letterArray[i] = (char) (((int) letterArray[i]) - 1);
      }
    }
    return letterArray;
  }
}