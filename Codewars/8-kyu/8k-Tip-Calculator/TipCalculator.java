import java.util.HashMap;
import java.util.Map;

public class TipCalculator {
  private static Map<String, Double> tips = new HashMap<>();
  
  static {
    tips.put("terrible", 0.0);
    tips.put("poor", 0.05);
    tips.put("good", 0.1);
    tips.put("great", 0.15);
    tips.put("excellent", 0.2);
  }

  public static Integer calculateTip(double amount, String rating) {
    rating = rating.toLowerCase();
    return tips.containsKey(rating) ? (int) Math.ceil(amount * tips.get(rating)) : null;
  } // calculateTip()

  public static void main(String[] args) {
    System.out.println(calculateTip(30d, "poor"));
    System.out.println(calculateTip(20d, "Excellent"));
    System.out.println(calculateTip(20d, "hi"));
    System.out.println(calculateTip(107.65, "GReat"));
  } // main()
} // TipCalculator
