class SolutionC {
  public int lengthOfLongestSubstring(String s) {
    final int[] used = new int[128];
    int max = 0;
    int l = 0;
    for (int r = 0; r < s.length(); r++) {
      final char ch = s.charAt(r);
      if (used[ch] > l) {
        l = used[ch];
      }
      used[ch] = r + 1;
      max = Math.max(r - l + 1, max);
    }
    return max;
  } // lengthOfLongestSubstring()

  public static void main(String[] args) {
    final SolutionC sol = new SolutionC();
    System.out.println(sol.lengthOfLongestSubstring("abcabcbb"));
    System.out.println(sol.lengthOfLongestSubstring("bbbbb"));
    System.out.println(sol.lengthOfLongestSubstring("pwwkew"));
  } // main()
} // SolutionC
