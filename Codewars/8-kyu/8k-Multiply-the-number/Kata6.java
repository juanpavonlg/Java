public class Kata6 {
  public static int multiply(int number) {
    final int num = number;
    int pow = 0;
    while (number != 0) {
      number /= 10;
      pow++;
    }
    return num * (int) Math.pow(5, pow);
  } // multiply()

  public static void main(String[] args) {
    System.out.println(multiply(3));
    System.out.println(multiply(10));
    System.out.println(multiply(200));
    System.out.println(multiply(0));
    System.out.println(multiply(-3));
  } // main()
} // Kata6
