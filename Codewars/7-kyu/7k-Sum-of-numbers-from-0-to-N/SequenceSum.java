public class SequenceSum {
  public static String showSequence(int value) {
    if (value <= 0) {
      return value + (value == 0 ? "=0" : "<0");
    }
    String[] ans = new String[value + 1];
    for (int i = 0; i <= value; i++) {
      ans[i] = "" + i;
    }
    return String.join("+", ans) + " = " + (value) * (value + 1) / 2;
  } // showSequence()

  public static void main(String[] args) {
    System.out.println(showSequence(6));
    System.out.println(showSequence(-15));
    System.out.println(showSequence(0));
  } // main()
} // SequenceSum
