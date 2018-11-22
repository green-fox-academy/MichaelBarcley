package countletters;

import java.util.HashMap;

public class CountLetters {
  public CountLetters() {
  }

  public HashMap<String, Integer> getLetterDictionary(String string) {
    HashMap<String, Integer> returnedDictionary = new HashMap<>();
    String lowerCaseString = string.toLowerCase();

    for (int i = 0; i < string.length(); i++) {
      if (!lowerCaseString.split("")[i].equals(" ")) {
        returnedDictionary.merge(lowerCaseString.split("")[i], 1, Integer::sum);
      }
    }
    return returnedDictionary;
  }
}
