public class Factorial {
  public int factorial(int n) {
    if (n < 0 || n > 12) {
      throw new IllegalArgumentException();
    }
    return n > 1 ? n * factorial(n - 1) : 1;
  } // factorial()

  public static void main(String[] args) {
    final Factorial f = new Factorial();
    System.out.println(f.factorial(5));
  } // main()
} // Factorial
