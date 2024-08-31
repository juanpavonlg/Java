// import java.util.Arrays;
import java.util.function.IntPredicate;

public class Solution {
  public static boolean all(int[] list, IntPredicate predicate) {
    for (final int e : list) {
      if (!predicate.test(e)) {
        return false;
      }
    }
    return true;
    // return Arrays.stream(list).allMatch(predicate);
  } // all()

  private static final IntPredicate evenNumber = n -> n % 2 == 0;
  private static final IntPredicate oddNumber = n -> n % 2 != 0;
  private static final IntPredicate lessThan10 = n -> n < 10;
  private static final IntPredicate lessThan5 = n -> n < 5;
  private static final IntPredicate greaterThan1 = n -> n > 1;
  private static final IntPredicate greaterThan5 = n -> n > 5;
  private static final IntPredicate greaterThan10 = n -> n > 10;

  public static void main(String[] args) {
    System.out.println(all(new int[] { 2, 4, 6, 10 }, evenNumber));
    System.out.println(all(new int[] { 1, 3, 5, 10 }, oddNumber));
    System.out.println(all(new int[] { 2, 4, 6, 19 }, lessThan10));
    System.out.println(all(new int[] { 1, 1, 2 }, lessThan5));
    System.out.println(all(new int[] { 2, 9, 4, 3 }, greaterThan1));
    System.out.println(all(new int[] { 2, 9, 4, 0 }, greaterThan1));
    System.out.println(all(new int[] { 5, 6, 7, 8 }, greaterThan5));
    System.out.println(all(new int[] { 13, 42 }, greaterThan10));
    System.out.println(all(new int[] { 5 }, evenNumber));
    System.out.println(all(new int[] { 5 }, oddNumber));
    System.out.println(all(new int[] { 5 }, lessThan5));
    System.out.println(all(new int[] {}, evenNumber));
    System.out.println(all(new int[] {}, lessThan5));
    System.out.println(all(new int[] {}, greaterThan10));
  } // main()
} // Solution
