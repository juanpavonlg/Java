import java.util.Arrays;

public class FruitGuy {
  public static String[] removeRotten(String[] fruitBasket) {
    return fruitBasket != null
        ? Arrays.stream(fruitBasket).map(fruit -> fruit.toLowerCase().replace("rotten", "")).toArray(String[]::new)
        : new String[0];
  } // removeRotten()

  public static void main(String[] args) {
    for (final String fruit : removeRotten(new String[] { "apple", "rottenBanana", "apple" })) {
      System.out.println(fruit);
    }
  } // main()
} // FruitGuy
