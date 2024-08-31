public class Kata8 {
  public static int[] DataReverse(int[] data) {
    // final int[] copy = new int[data.length];
    // System.arraycopy(data, 0, copy, 0, data.length);
    // final int bytes = data.length / 16;
    // for (int i = 0; i < bytes; i++) {
    //   final int l0 = 8 * i;
    //   final int r0 = data.length - 8 * (1 + i);
    //   for (int j = 0; j < 8; j++) {
    //     final int l = l0 + j;
    //     final int r = r0 + j;
    //     copy[r] = copy[l] + copy[r] - (copy[l] = copy[r]);
    //   }
    // }
    // return copy;
    final int[] copy = new int[data.length];
    for (int i = 0; i < data.length; i += 8) {
      System.arraycopy(data, i, copy, data.length - 8 - i, 8);
    }
    return copy;
  } // DataReverse()

  public static void main(String[] args) {
    for (final int e : DataReverse(
        new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0 })) {
      System.out.println(e);
    }
    for (final int e : DataReverse(new int[] { 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1 })) {
      System.out.println(e);
    }
  } // main()
} // Kata8
