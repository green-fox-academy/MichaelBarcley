package mypirates;

public class Pirate {
  int rumsDrank;
  boolean isSleeping;
  boolean isDead;
  boolean hasParrot;
  boolean isCaptain;

  Pirate () {
    this(false);
  }

  Pirate (boolean isCaptain) {
    rumsDrank = 0;
    isSleeping = false;
    isDead = false;
    hasParrot = false;
    this.isCaptain = isCaptain;
  }

  public void drinkSomeRum() {
    if (!this.isDead) {
      this.rumsDrank++;
    } else {
      System.out.println("Cap'n! This landrubber is dead and can't drink more rum!");
    }
  }

  public boolean howItGoingMate() {
    if (this.isDead) {
      System.out.println("Cap'n! This landrubber is dead!");
      return this.isSleeping;
    } else if (this.rumsDrank <= 4 && !this.isSleeping) {
      System.out.println("Pour me anudder!");
      return this.isSleeping;
    } else {
      System.out.println("Arghh, I'm a Pirate. How d'ya d'ink its goin'?");
      return this.isSleeping = true;
    }
  }

  public boolean die() {
    return this.isDead = true;
  }

  public void brawl(Pirate anotherPirate) {
    int rolledNumber = 1 + (int) (Math.random()*100);
    if(rolledNumber < 34) {
      this.die();
      System.out.println("Cap'n! One of the pirates has died after he attacked another pirate!");
    } else if (rolledNumber > 33 && rolledNumber < 67) {
      anotherPirate.die();
      System.out.println("Cap'n! One of the pirates has died after he was got stabbed by another pirate!");
    } else {
      this.isSleeping = true;
      anotherPirate.isSleeping = true;
      System.out.println("Cap'n! Two mateys had a brawl and they both passed out!");
    }
  }

  public boolean giveParrot() {
    return this.hasParrot = true;
  }

  public void hasParrot() {
    if (this.hasParrot) {
      System.out.println("Yo-ho-ho! Come here mah parrot!");
    } else {
      System.out.println("Yarr! Where's mah parrot?");
    }
  }
}
