public class Block {
  final int width;
  final int length;
  final int height;

  public Block(int... sides) {
    this.width = sides[0];
    this.length = sides[1];
    this.height = sides[2];
  } // Block()

  public int getWidth() {
    return this.width;
  } // getWidth()

  public int getLength() {
    return this.length;
  } // getLength()

  public int getHeight() {
    return this.height;
  } // getHeight()

  public int getVolume() {
    return this.getWidth() * this.getLength() * this.getHeight();
  } // getVolume()

  public int getSurfaceArea() {
    return 2 * (this.getWidth() * this.getLength() + this.getWidth() * this.getHeight()
        + this.getLength() * this.getHeight());
  } // getSurfaceArea()

  public static void main(String[] args) {
    final Block b = new Block(new int[] { 2, 4, 6 });
    System.out.println(b.getWidth());
    System.out.println(b.getLength());
    System.out.println(b.getHeight());
    System.out.println(b.getVolume());
    System.out.println(b.getSurfaceArea());
  } // main()
} // Block
