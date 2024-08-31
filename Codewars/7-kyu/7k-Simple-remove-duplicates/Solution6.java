import java.util.LinkedList;

class Solution6 {
  public static int[] solve(int[] arr) {
    final LinkedList<Integer> lst = new LinkedList<>();
    for (int i = arr.length - 1; i >= 0; i--) {
      if (!lst.contains(arr[i])) {
        lst.addFirst(arr[i]);
      }
    }
    return lst.stream().mapToInt(e -> e).toArray();
  } // solve()

  public static void main(String[] args) {
    for (final int e : solve(new int[] { 3, 4, 4, 3, 6, 3 })) {
      System.out.println(e);
    }
  } // main()
} // Solution6
