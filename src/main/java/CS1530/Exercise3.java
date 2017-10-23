package CS1530;

public class Exercise3 {

  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Please only enter one argument...");
      System.exit(1);
    }

    int number;
    try {
      number = Integer.parseInt(args[0]);

      int tri = triangle(number);
      int lc = lazyCaterer(number);

      System.out.println("Tri(n) = " + tri);
      System.out.println("Lazy(n) = " + lc);
    } catch (Exception e) {
      System.out.println("Please a valid (integer) argument...");
      System.exit(1);
    }
  }

  public static int triangle(int number) {
    return (number * (number + 1))/2;
  }

  public static int lazyCaterer(int number) {
    return ((int)Math.pow(number, 2) + number + 2)/2;
  }
}
