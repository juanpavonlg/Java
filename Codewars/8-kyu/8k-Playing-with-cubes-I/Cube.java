public class Cube {
  private int side;

  public void setSide(int side) {
    this.side = side;
  } // setSide()

  public int getSide() {
    return this.side;
  } // getSide()

  public static void main(String[] args) {
    Cube c = new Cube();
    System.out.println(c.getSide());
    c.setSide(3);
    System.out.println(c.getSide());
  } // main()
} // Cube
