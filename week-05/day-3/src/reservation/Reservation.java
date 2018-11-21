package reservation;

public class Reservation implements Reservationy {
  protected String dowBooking;
  protected String codeBooking;

  Reservation(String dow) {
    this.dowBooking = dow;
    this.codeBooking = generateCode();
  }

  Reservation() {
    this(getRandomDOW());
  }

  public String getDowBooking() {
    return dowBooking;
  }

  public String getCodeBooking() {
    return codeBooking;
  }

  public String toString() {
    return "Booking# " + codeBooking + " for " + dowBooking;
  }

  public static String getRandomDOW() {
    String[] dows = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    int randomDow = (int) (Math.random() * 7);
    return dows[randomDow];
  }

  public static char getRandomCharForCode() {
    String charList = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    int charCode = (int) (Math.random() * charList.length());
    return charList.charAt(charCode);
  }

  public static String generateCode() {
    String result = "";
    for (int i = 0; i < 8; i++) {
      result += getRandomCharForCode();
    }
    return result;
  }

  public static void main(String[] args) {
    Reservation res1 = new Reservation();
    Reservation res2 = new Reservation();
    Reservation res3 = new Reservation();
    Reservation res4 = new Reservation();

    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
  }
}
