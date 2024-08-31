public class Hero {
  final String name;
  final String position = "00";
  final int health = 100;
  final int damage = 5;
  final int experience = 0;

  public Hero() {
    this("Hero");
  } // Hero()

  public Hero(String name) {
    this.name = name;
  } // Hero()

  public static void main(String[] args) {
    final Hero hero = new Hero();
    System.out.println(hero.name);
    System.out.println(hero.experience);
    System.out.println(hero.health);
    System.out.println(hero.position);
    System.out.println(hero.damage);
    final Hero bjornTheViking = new Hero("Björn Øhrling");
    System.out.println(bjornTheViking.name);
  } // main
} // Hero
