public class TheOffice {
  public static Object meeting(char[] x) {
    final int index = new String(x).indexOf('O');
    return index >= 0 ? index : "None available!";
  } // meeting()

  public static void main(String[] args) {
    System.out.println(meeting(new char[] { 'X', 'O', 'X' }));
    System.out.println(meeting(new char[] { 'O', 'X', 'X', 'X', 'X' }));
    System.out.println(meeting(new char[] { 'X', 'X', 'O', 'X', 'X' }));
    System.out.println(meeting(new char[] { 'X', 'X', 'X', 'X', 'X' }));
  } // main()
} // TheOffice
