public class Kata10 {
  public static int[] Solve(String word) {
    final int[] count = new int[4];
    for (int i = 0; i < word.length(); i++) {
      final char ch = word.charAt(i);
      if (ch >= 'A' && ch <= 'Z') {
        count[0]++;
      } else if (ch >= 'a' && ch <= 'z') {
        count[1]++;
      } else if (ch >= '0' && ch <= '9') {
        count[2]++;
      } else {
        count[3]++;
      }
    }
    return count;
  } // Solve()

  public static void main(String[] args) {
    for (final int e : Solve("*'&ABCDabcde12345")) {
      System.out.println(e);
    }
  } // main()
} // Kata10
