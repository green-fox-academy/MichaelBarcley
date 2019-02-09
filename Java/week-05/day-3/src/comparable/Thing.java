package comparable;

public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  public Thing(String name, boolean completed) {
    this.name = name;
    this.completed = completed;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing thing) {
    if (this.completed != thing.completed) {
      if (this.completed) {
        return 1;
      } else {
        return -1;
      }
    }
    return this.name.compareTo(thing.name);
  }
}
