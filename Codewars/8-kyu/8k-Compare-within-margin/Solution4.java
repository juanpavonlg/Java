public class Solution4 {
  public static int closeCompare(double a, double b, double... margin) {
    final double diff = a - b;
    if (margin.length > 0) {
      if (Math.abs(diff) <= margin[0]) {
        return 0;
      }
    }
    return (int) Math.signum(diff);
  } // closeCompare()

  public static int closeCompare(double a, double b, double margin) {
    return Math.abs(a - b) <= margin ? 0 : a < b ? -1 : 1;
  } // closeCompare()

  public static int closeCompare(double a, double b) {
    return closeCompare(a, b, 0);
  } // closeCompare()

  public static void main(String[] args) {
    System.out.println(closeCompare(3, 5, 3));
    System.out.println(closeCompare(3, 5, 0));
    System.out.println(closeCompare(4, 5));
    System.out.println(closeCompare(5, 5));
    System.out.println(closeCompare(6, 5));
    System.out.println(closeCompare(-6, -5));
    System.out.println(closeCompare(2, 5, 3));
    System.out.println(closeCompare(8.1, 5, 3));
    System.out.println(closeCompare(1.99, 5, 3));
  } // main()
} // Solution4
