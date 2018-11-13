package mypackage;

public class Main {

    public static void main(String[] args) {

      //This is for the exercise "Sharpie".
      Sharpie cica = new Sharpie("Red", 2, 100);
      System.out.println(cica.inkAmount);
      cica.use();
      System.out.println(cica.inkAmount);
      System.out.println();

      //This part is for the SharpieSet exercise.
      SharpieSet mySharpieSet = new SharpieSet();

      mySharpieSet.add(new Sharpie("Red", 2, 100));
      mySharpieSet.add(new Sharpie("Gold", 3, 63));
      mySharpieSet.add(new Sharpie("Black", 4, 0));
      mySharpieSet.add(new Sharpie("Green", 1, 24));
      mySharpieSet.add(new Sharpie("Blue", 3, 94));

      System.out.println(mySharpieSet.countSharpies());
      System.out.println(mySharpieSet.countUsable());
      mySharpieSet.removeTrash();

      //This part is only to check myself.
      System.out.println(mySharpieSet.countSharpies());
      mySharpieSet.showColorsOfElements();
    }
}
