import java.util.Arrays;

public class Solution3 {
  public static int largestPairSum(int[] numbers) {
    Arrays.sort(numbers);
    return numbers[numbers.length - 1] + numbers[numbers.length - 2];
  } // largestPairSum()

  public static void main(String[] args) {
    System.out.println(largestPairSum(new int[] { 10, 14, 2, 23, 19 }));
    System.out.println(largestPairSum(new int[] { 99, 2, 2, 23, 19 }));
  } // main()
} // Solution3
