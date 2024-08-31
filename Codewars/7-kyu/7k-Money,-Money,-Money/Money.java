public class Money {
  public static int calculateYears(double principal, double interest, double tax, double desired) {
    int years = 0;
    while (principal < desired) {
      principal += principal * interest * (1 - tax);
      years++;
    }
    return years;
  } // calculateYears()

  public static void main(String[] args) {
    System.out.println(calculateYears(1000, 0.05, 0.18, 1100));
  } // main()
} // Money
