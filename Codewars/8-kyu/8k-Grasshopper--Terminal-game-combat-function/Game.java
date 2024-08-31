public class Game {
  public static int combat(int health, int damage) {
    return health > damage ? health - damage : 0;
  } // combat()

  public static void main(String[] args) {
    System.out.println(combat(100, 5));
    System.out.println(combat(92, 8));
    System.out.println(combat(20, 30));
    System.out.println(combat(50, 49));
    System.out.println(combat(33, 33));
  } // main()
} // Game
