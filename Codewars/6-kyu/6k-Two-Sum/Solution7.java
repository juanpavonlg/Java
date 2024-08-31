import java.util.HashMap;
import java.util.Map;

public class Solution7 {
  public static int[] twoSum(int[] numbers, int target) {
    final Map<Integer, Integer> visited = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      if (visited.containsKey(numbers[i])) {
        return new int[] { visited.get(numbers[i]), i };
      }
      visited.put(target - numbers[i], i);
    }
    return null;
  } // twoSum()

  public static void main(String[] args) {
    for (final int e : twoSum(new int[] { 1, 2, 3 }, 4)) {
      System.out.println(e);
    }
    for (final int e : twoSum(new int[] { 3, 2, 4 }, 6)) {
      System.out.println(e);
    }
  } // main()
} // Solution7
