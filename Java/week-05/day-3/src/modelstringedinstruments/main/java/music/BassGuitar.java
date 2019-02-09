package modelstringedinstruments.main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    this(4);
  }

  public BassGuitar(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }

  @Override
  public void play() {
    System.out.println("Bass Guitar, a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound());
  }
}
