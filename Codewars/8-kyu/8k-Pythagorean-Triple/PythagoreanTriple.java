import java.util.Arrays;

public class PythagoreanTriple {
  public int pythagoreanTriple(int[] triple) {
    Arrays.sort(triple);
    return triple[0] * triple[0] + triple[1] * triple[1] == triple[2] * triple[2] ? 1 : 0;
  } // pythagoreanTriple()

  public static void main(String[] args) {
    final PythagoreanTriple triple = new PythagoreanTriple();
    System.out.println(triple.pythagoreanTriple(new int[] { 5, 3, 4 }));
    System.out.println(triple.pythagoreanTriple(new int[] { 3, 4, 5 }));
    System.out.println(triple.pythagoreanTriple(new int[] { 13, 12, 5 }));
    System.out.println(triple.pythagoreanTriple(new int[] { 100, 3, 999 }));
  } // main()
} // PythagoreanTriple
