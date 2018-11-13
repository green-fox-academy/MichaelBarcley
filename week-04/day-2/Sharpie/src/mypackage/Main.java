package mypackage;

public class Main {

    public static void main(String[] args) {
      Sharpie cica = new Sharpie("Red", 2);
      System.out.println(cica.inkAmount);
      cica.use();
      System.out.println(cica.inkAmount);
    }
}
