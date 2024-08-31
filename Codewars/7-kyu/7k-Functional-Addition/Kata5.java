import java.util.function.IntUnaryOperator;

public class Kata5 {
  public static IntUnaryOperator add(int n) {
    return new IntUnaryOperator() {
      @Override
      public int applyAsInt(int m) {
          return m + n;
      } // applyAsInt()
    };
    // return m -> m + n;
  } // add()

  public static void main(String[] args) {
    IntUnaryOperator addOne = Kata5.add(1);
    System.out.println(addOne.applyAsInt(0));
    System.out.println(addOne.applyAsInt(3));
    System.out.println(Kata5.add(3).applyAsInt(5));
  }
} // Kata5
