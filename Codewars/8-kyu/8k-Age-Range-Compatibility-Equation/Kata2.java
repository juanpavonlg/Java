public class Kata2 {
  public static String datingRange(int age) {
    int min = 0;
    int max = 0;
    if (age > 14) {
      min = age / 2 + 7;
      max = (age - 7) * 2;
    } else {
      min = (int) (0.9 * age);
      max = (int) (1.1 * age);
    }
    return String.format("%d-%d", min, max);
    // return age > 14 ? age / 2 + 7 + "-" + (age - 7) * 2 : (int) (0.9 * age) + "-" + (int) (1.1 * age);
  } // datingRange()

  public static void main(String[] args) {
    System.out.println(datingRange(27));
    System.out.println(datingRange(5));
    System.out.println(datingRange(17));
  } // main()
} // Kata
