public class RoundToTheNextMultipleOf5 {
  public static int roundToNext5(int number) {
    return (int) Math.ceil(number / 5.0) * 5;
  } // roundToNext5()

  public static void main(String[] args) {
    System.out.println(roundToNext5(0));
    System.out.println(roundToNext5(2));
    System.out.println(roundToNext5(3));
    System.out.println(roundToNext5(12));
    System.out.println(roundToNext5(21));
    System.out.println(roundToNext5(30));
    System.out.println(roundToNext5(-2));
    System.out.println(roundToNext5(-5));
  } // main()
} // RoundToTheNextMultipleOf5
