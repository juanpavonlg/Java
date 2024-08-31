public class Dinglemouse {
  public static int countDeafRats(final String town) {
    final String clean = town.replaceAll(" ", "");
    int deafRats = 0;
    for (int i = 0; i < clean.length(); i += 2) {
      if (clean.charAt(i) == 'O') {
        deafRats++;
      }
    }
    return deafRats;
  } // countDeafdeafRats()

  public static void main(String[] args) {
    System.out.println(countDeafRats("~O~O~O~O P"));
    System.out.println(countDeafRats("P O~ O~ ~O O"));
    System.out.println(countDeafRats("~O~O~O~OP~O~OO~"));
  } // main()
} // Dinglemouse
