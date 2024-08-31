public class Solution2 {
  public static String shortenToDate(String longDate) {
    return longDate.substring(0, longDate.indexOf(","));
  } // shortenToDate()

  public static void main(String[] args) {
    System.out.println(shortenToDate("Friday May 2, 7pm"));
  } // main()
} // Solution
