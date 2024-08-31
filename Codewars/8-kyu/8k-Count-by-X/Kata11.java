import java.util.stream.IntStream;

public class Kata11 {
  public static int[] countBy(int x, int n) {
    final int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      ans[i] = x * (i + 1);
    }
    return ans;
    // return IntStream.rangeClosed(1, n).map(e -> e * x).toArray();
  } // countBy()

  public static void main(String[] args) {
    for (final int e : countBy(1, 10)) {
      System.out.println(e);
    }
    for (final int e : countBy(2, 5)) {
      System.out.println(e);
    }
  } // main()
} // Kata11
