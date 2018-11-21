package printable;

public class Thing implements Printable {
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
  public void printAllFields() {
    System.out.println("Name of task: " + this.name);
    System.out.println("Status of task: " + this.completed);
  }
}
