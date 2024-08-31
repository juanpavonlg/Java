public class AgeDiff {
  public static String CalculateAge(int birth, int yearTo) {
    if (birth < yearTo) {
      final int years = yearTo - birth;
      return String.format("You are %d year%s old.", years, years > 1 ? "s" : "");
    } else if (birth > yearTo) {
      final int years = birth - yearTo;
      return String.format("You will be born in %d year%s.", years, years > 1 ? "s" : "");
    }
    return "You were born this very year!";
  } // CalculateAge()

  public static void main(String[] args) {
    System.out.println(AgeDiff.CalculateAge(2012, 2016));
    System.out.println(AgeDiff.CalculateAge(1989, 2016));
    System.out.println(AgeDiff.CalculateAge(2000, 2090));
    System.out.println(AgeDiff.CalculateAge(2000, 1990));
    System.out.println(AgeDiff.CalculateAge(3400, 3400));
    System.out.println(AgeDiff.CalculateAge(900, 2900));
    System.out.println(AgeDiff.CalculateAge(2010, 1900));
    System.out.println(AgeDiff.CalculateAge(2010, 1500));
    System.out.println(AgeDiff.CalculateAge(2011, 2012));
    System.out.println(AgeDiff.CalculateAge(2000, 1999));
  } // main()
} // AgeDiff