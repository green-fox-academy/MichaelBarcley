package mypackage;

public class FleetOfThings {

  public static void main(String[] args) {
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing line1 = new Thing("Get milk");
    Thing line2 = new Thing("Remove the obstacles");
    Thing line3 = new Thing("Stand up");
    Thing line4 = new Thing("Eat lunch");

    line3.complete();
    line4.complete();

    Fleet fleet = new Fleet();
    fleet.add(line1);
    fleet.add(line2);
    fleet.add(line3);
    fleet.add(line4);

    System.out.println(fleet);
  }
}
