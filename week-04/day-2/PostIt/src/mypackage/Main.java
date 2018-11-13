package mypackage;

public class Main {

  public static void main(String[] args) {
    PostIt note1 = new PostIt("orange", "Idea 1", "blue");
    PostIt note2 = new PostIt("pink", "Awesome", "black");
    PostIt note3 = new PostIt("yellow", "Superb", "green");

    System.out.println(note1.backgroundColor);
    System.out.println(note2.text);
    System.out.println(note3.textColor);
  }
}
