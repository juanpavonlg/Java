import java.util.HashMap;
import java.util.Map;

public class DayOfWeek {
  private static Map<Integer, String> days = new HashMap<>();

  static {
    days.put(1, "Sunday");
    days.put(2, "Monday");
    days.put(3, "Tuesday");
    days.put(4, "Wednesday");
    days.put(5, "Thursday");
    days.put(6, "Friday");
    days.put(7, "Saturday");
  }

  public static String getDay(int n) {
    return days.containsKey(n) ? days.get(n) : "Wrong, please enter a number between 1 and 7";
    // return switch (n) {
    //   case 1 -> "Sunday";
    //   case 2 -> "Monday";
    //   case 3 -> "Tuesday";
    //   case 4 -> "Wednesday";
    //   case 5 -> "Thursday";
    //   case 6 -> "Friday";
    //   case 7 -> "Saturday";
    //   default -> "Wrong, please enter a number between 1 and 7";
    // };
  } // getDay()

  public static void main(String[] args) {
    System.out.println(getDay(1));
    System.out.println(getDay(2));
    System.out.println(getDay(3));
    System.out.println(getDay(8));
    System.out.println(getDay(20));
  } // main()
} // DayOfWeek
