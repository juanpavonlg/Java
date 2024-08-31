import java.util.Random;

public class Ghost {
  private final static String[] colors = { "white", "yellow", "purple", "red" };

  private final String color;

  public Ghost() {
    this.color = colors[new Random().nextInt(colors.length)];
  } // Ghost()

  public String getColor() {
    return this.color;
  } // getColor()

  public static void main(String[] args) {
    final Ghost ghost = new Ghost();
    System.out.println(ghost.getColor());
  } // main()
} // Ghost
