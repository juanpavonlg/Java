class Player {
  final String name;

  public Player(String name) {
    this.name = name;
  } // Player()
} // Player

public class Kata13 {
  private static Player[] makePlayerArr(String[] names) {
    Player[] players = new Player[names.length];
    for (int i = 0; i < names.length; i++) {
      players[i] = new Player(names[i]);
    }
    return players;
  } // makePlayerArr()

  public static String duckDuckGoose(Player[] players, int goose) {
    return players[(goose - 1) % players.length].name;
  } // duckDuckGoose()

  public static void main(String[] args) {
    final Player[] players = makePlayerArr(new String[] {"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"});
    System.out.println(duckDuckGoose(players, 1));
    System.out.println(duckDuckGoose(players, 3));
    System.out.println(duckDuckGoose(players, 10));
    System.out.println(duckDuckGoose(players, 20));
    System.out.println(duckDuckGoose(players, 30));
    System.out.println(duckDuckGoose(players, 18));
    System.out.println(duckDuckGoose(players, 28));
    System.out.println(duckDuckGoose(players, 12));
    System.out.println(duckDuckGoose(players, 2));
    System.out.println(duckDuckGoose(players, 7));
  } // main()
} // Kata13
