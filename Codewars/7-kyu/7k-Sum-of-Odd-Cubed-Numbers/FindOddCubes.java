import java.util.Arrays;

public class FindOddCubes {
  public static int cubeOdd(int arr[]) {
    return Arrays.stream(arr).map(e -> e % 2 != 0 ? (int) Math.pow(e, 3) : 0 * e).sum();
  } // cubeOdd()

  public static void main(String[] args) {
    System.out.println(cubeOdd(new int[] {-5, -5, 5, 5}));
    System.out.println(cubeOdd(new int[] {1, 2, 3, 4}));
    System.out.println(cubeOdd(new int[] {-3, -2, 2, 3}));
  } // main()
} // FindOddCubes
