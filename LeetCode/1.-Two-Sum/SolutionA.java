import java.util.HashMap;
import java.util.Map;

class SolutionA {
  public int[] twoSum(int[] nums, int target) {
    final Map<Integer, Integer> used = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      final Integer index = used.get(nums[i]);
      if (index != null) {
        return new int[] { index, i };
      }
      used.put(target - nums[i], i);
    }
    return null;
  } // twoSum()

  public static void main(String[] args) {
    final SolutionA sol = new SolutionA();
    for (final int e : sol.twoSum(new int[] { 2, 7, 11, 15 }, 9)) {
      System.out.println(e);
    }
    for (final int e : sol.twoSum(new int[] { 3, 2, 4 }, 6)) {
      System.out.println(e);
    }
    for (final int e : sol.twoSum(new int[] { 3, 3 }, 6)) {
      System.out.println(e);
    }
  } // main()
} // SolutionA
