import java.util.Arrays;

public class SumArray {
  public static double sum(double[] numbers) {
    return Arrays.stream(numbers).sum();
  } // sum()

  public static void main(String[] args) {
    System.out.println(sum(new double[] { 1, 5.2, 4, 0, -1 }));
    System.out.println(sum(new double[] {}));
    System.out.println(sum(new double[] { -2.398 }));
  } // main()
} // SumArray