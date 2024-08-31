import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
// import java.util.stream.IntStream;

public class Kata {
  public static int[] mergeArrays(int[] first, int[] second) {
    final Set<Integer> set = new HashSet<>();
    for (final int e : first) {
      set.add(e);
    }
    for (final int e : second) {
      set.add(e);
    }
    final Integer[] arr = set.toArray(new Integer[0]);
    final int[] ans = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      ans[i] = arr[i];
    }
    Arrays.sort(ans);
    return ans;
    // return IntStream.concat(IntStream.of(first), IntStream.of(second)).distinct().sorted().toArray();
  } // mergeArrays()

  public static void main(String[] args) {
    for (final int e : mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 })) {
      System.out.println(e);
    }
    for (final int e : mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 })) {
      System.out.println(e);
    }
  } // main()
} // Kata
