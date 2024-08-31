import java.util.Arrays;

public class ZywOo {
  public static int[] take(int[] arr, int n) {
    return arr.length > n ? Arrays.copyOf(arr, n) : arr;
  } // take()

  public static void main(String[] args) {
    for (final int e : take(new int[] { 0, 1, 2, 3, 5, 8, 13 }, 3)) {
      System.out.println(e);
    }
  } // main()
} // ZywOo