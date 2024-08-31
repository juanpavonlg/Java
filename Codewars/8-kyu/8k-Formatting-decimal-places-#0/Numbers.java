public class Numbers {
  public static double TwoDecimalPlaces(double number) {
    return Math.floor(100 * number + 0.5) / 100;
  } // TwoDecimalPlaces()

  public static void main(String[] args) {
    System.out.println(TwoDecimalPlaces(5.5589));
    System.out.println(TwoDecimalPlaces(3.3424));
  } // main()
} // Numbers
