public class Kata12 {
  public static String shortcut(String input) {
    return input.replaceAll("[aeiou]", "");
  } // shortcut()

  public static void main(String[] args) {
    System.out.println(shortcut("hello"));
    System.out.println(shortcut("codewars"));
    System.out.println(shortcut("goodbye"));
    System.out.println(shortcut("HELLO"));
  } // main()
} // Kata12
