class SolutionE {
    public String longestPalindrome(String s) {
      final int sLen = s.length();
      String sub = "";
      int i = 0;
      while (i < sLen) {
        int j = i;
        while (j + 1 < sLen && s.charAt(i) == s.charAt(j + 1)) {
          j++;
        }
        int k = 1;
        while (i - k >= 0 && j + k < sLen && s.charAt(i - k) == s.charAt(j + k)) {
          k++;
        }
        final int first = i - k + 1;
        final int last = j + k;
        final int subLen = sub.length();
        if (last - first > subLen) {
          sub = s.substring(first, last);
          if (subLen == sLen) {
            break;
          }
        }
        i++;
      }
      return sub;
    } // longestPalindrome()

    public static void main(String[] args) {
      final SolutionE sol = new SolutionE();
      System.out.println(sol.longestPalindrome("babad"));
      System.out.println(sol.longestPalindrome("cbbd"));
      System.out.println(sol.longestPalindrome("a"));
    } // main()
} // SolutionE
