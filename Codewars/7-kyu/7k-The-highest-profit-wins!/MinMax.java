import java.util.Arrays;

class MinMax {
  public static int[] minMax(int[] arr) {
    return new int[] { Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt() };
  } // minMax()

  public static void main(String[] args) {
    for (final int e : minMax(new int[] { 1, 2, 3, 4, 5 })) {
      System.out.println(e);
    }
    for (final int e : minMax(new int[] { 2334454, 5 })) {
      System.out.println(e);
    }
    for (final int e : minMax(new int[] { 1 })) {
      System.out.println(e);
    }
  } // main()
} // MinMax
