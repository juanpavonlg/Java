public class HQ {
  public static String HQ9(char code) {
    switch (code) {
      case 'H':
        return "Hello World!";
      case 'Q':
        return "Q";
      case '9':
        int bottles = 99;
        String bottlesOfBeer = String.format("%d bottles of beer on the wall, %d bottles of beer.%n", bottles, bottles);
        while (bottles > 2) {
          bottles--;
          bottlesOfBeer += String.format("Take one down and pass it around, %d bottles of beer on the wall.%n" +
              "%d bottles of beer on the wall, %d bottles of beer.%n", bottles, bottles, bottles);
        }
        bottlesOfBeer += "Take one down and pass it around, 1 bottle of beer on the wall.\n" +
            "1 bottle of beer on the wall, 1 bottle of beer.\n" +
            "Take one down and pass it around, no more bottles of beer on the wall.\n" +
            "No more bottles of beer on the wall, no more bottles of beer.\n" +
            "Go to the store and buy some more, 99 bottles of beer on the wall.";
        return bottlesOfBeer;
    }
    return null;
  } // HQ9()

  public static void main(String[] args) {
    System.out.println(HQ9('H'));
    System.out.println(HQ9('Q'));
    System.out.println(HQ9('9'));
  } // main
} // HQ
