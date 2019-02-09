package aircraftcarrier;

public class Aircraft {
  private String type;
  private int currentAmmo;
  private int maxAmmo;
  private int baseDamage;

  Aircraft(int maxAmmo, int baseDamage) {
    this.currentAmmo = 0;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
  }

  Aircraft() {
    this(5, 5);
  }

  public int getCurrentAmmo() {
    return currentAmmo;
  }

  public void setCurrentAmmo(int currentAmmo) {
    this.currentAmmo = currentAmmo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int fight() {
    int damageDealt = this.getCurrentAmmo() * this.getBaseDamage();
    this.setCurrentAmmo(0);
    return damageDealt;
  }

  public int refill(int ammo) {
    int ammoBeforeRefill = this.getCurrentAmmo();
    this.setCurrentAmmo(this.getMaxAmmo());
    return ammo - (this.getMaxAmmo() - ammoBeforeRefill);
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isPriority() {
    if (this.type.equals("F35")) {
      return true;
    } else {
      return false;
    }
  }

  public String getStatus() {
    return "Type: " + this.getType() + ", Ammo: " + this.getCurrentAmmo()
        + ", Base Damage: " + this.getBaseDamage() + ", All Damage: "
        + (this.getCurrentAmmo() * this.getMaxAmmo());
  }
}
