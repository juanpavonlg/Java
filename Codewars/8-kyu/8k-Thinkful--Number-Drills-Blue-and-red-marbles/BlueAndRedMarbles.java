public class BlueAndRedMarbles {
  public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
    final double blues = blueStart - bluePulled;
    return blues / (blues + redStart - redPulled);
  } // guessBlue()

  public static void main(String[] args) {
    System.err.println(guessBlue(5, 5, 2, 3));
  } // main()
} // BlueAndRedMarbles
