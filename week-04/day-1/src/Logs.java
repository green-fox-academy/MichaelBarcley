import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Logs {
  // Read all data from 'log.txt'.
  // Each line represents a log message from a web server
  // Write a function that returns an array with the unique IP addresses.
  // Write a function that returns the GET / POST request ratio.

  static Path inputFile = Paths.get("source/log.txt");

  public static void main(String[] args) {
    getIpAddresses();
    //requestRatio();
  }

  public static String[] getIpAddresses() {
    try {
      List<String> tempIpAddresses = Files.readAllLines(inputFile);
      String[] ipAddresses = new String[tempIpAddresses.size()];

      for (int i = 0; i < ipAddresses.length; i++) {
        ipAddresses[i] = tempIpAddresses.get(i).substring(27, 38);
      }
      return ipAddresses;

    } catch (IOException ie) {
      System.out.println("Problem.");
      return new String[0];
    }
  }

  /*public static int requestRatio() {
    return;
  }*/
}
