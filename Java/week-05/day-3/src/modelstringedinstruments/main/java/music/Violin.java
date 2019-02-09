package modelstringedinstruments.main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    this(4);
  }

  public Violin(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    return "Twang";
  }

  @Override
  public void play() {
    System.out.println("Violin, a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound());
  }
}
