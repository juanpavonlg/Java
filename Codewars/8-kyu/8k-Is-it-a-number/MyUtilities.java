public class MyUtilities {
  public boolean isDigit(String s) {
    try {
      Double.parseDouble(s);
    } catch(NumberFormatException nfe) {
      return false;
    }
    return true;
  } // isDigit()

  public static void main(String[] args) {
    final MyUtilities util = new MyUtilities();
    System.out.println(util.isDigit("3"));
    System.out.println(util.isDigit("  3  "));
    System.out.println(util.isDigit("-3.23"));
    System.out.println(util.isDigit("3-4"));
    System.out.println(util.isDigit("  3   5"));
    System.out.println(util.isDigit("3 5"));
    System.out.println(util.isDigit("zero"));
  } // main()
} // MyUtilities
