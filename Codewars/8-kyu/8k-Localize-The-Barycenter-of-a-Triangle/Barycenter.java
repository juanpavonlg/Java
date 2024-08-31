class Barycenter {
  public static double[] barTriang(double[] x, double[] y, double[] z) {
    final double x0 = Math.round((x[0] + y[0] + z[0]) / 3 * 10000) / 10000.0;
    final double y0 = Math.round((x[1] + y[1] + z[1]) / 3 * 10000) / 10000.0;
    return new double[] { x0, y0 };
  } // barTriang()

  public static void main(String[] args) {
    for (final double e : barTriang(new double[] { 4, 6 }, new double[] { 12, 4 }, new double[] { 10, 10 })) {
      System.out.println(e);
    }
    for (final double e : barTriang(new double[] { 4, 2 }, new double[] { 12, 2 }, new double[] { 6, 10 })) {
      System.out.println(e);
    }
  } // main()
} // Barycenter
