public class Kata3 {
  public static double fuelPrice(int litres, double pricePerLitre) {
    final double cost = litres * (pricePerLitre - Math.min(litres / 2 * 0.05, 0.25));
    return Math.floor(100 * cost + 0.5) / 100;
  } // fuelPrice()

  public static void main(String[] args) {
    System.out.println(Kata3.fuelPrice(5, 1.23));
    System.out.println(Kata3.fuelPrice(8, 2.5));
    System.out.println(Kata3.fuelPrice(5, 5.6));
  } // main()
} // Kata3
