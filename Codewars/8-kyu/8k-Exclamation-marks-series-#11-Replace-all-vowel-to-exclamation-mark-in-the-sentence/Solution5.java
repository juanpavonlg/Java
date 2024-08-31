public class Solution5 {
  public static String replace(final String s) {
    return s.replaceAll("(?i)[aeiou]", "!");
  } // replace()

  public static void main(String[] args) {
    System.out.println(replace("Hi!"));
    System.out.println(replace("!Hi! Hi!"));
    System.out.println(replace("aeiou"));
    System.out.println(replace("ABCDE"));
  } // main()
} // Solution5
