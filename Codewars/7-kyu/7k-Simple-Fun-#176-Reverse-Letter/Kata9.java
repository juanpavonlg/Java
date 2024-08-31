import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata9 {
  public static String reverseLetter(final String str) {
    final List<String> lst = Arrays.asList(str.replaceAll("[^a-z]", "").split(""));
    Collections.reverse(lst);
    return String.join("", lst);
    // return new StringBuilder(str.replaceAll("[^a-z]", "")).reverse().toString();
  } // reverseLetter()

  public static void main(String[] args) {
    System.out.println(reverseLetter("krishan"));
    System.out.println(reverseLetter("ultr53o?n"));
  } // main()
} // Kata9
