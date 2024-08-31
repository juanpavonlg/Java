public class Kata4 {
  public static String remove(String s, int n) {
    while (n-- > 0) {
      s = s.replaceFirst("!", "");
    }
    return s;
  } // remove()

  public static void main(String[] args) {
    System.out.println(remove("Hi!",1));
    System.out.println(remove("Hi!",100));
    System.out.println(remove("Hi!!!", 1));
    System.out.println(remove("Hi!!!",100));
    System.out.println(remove("!Hi",1));
    System.out.println(remove("!Hi!",1));
    System.out.println(remove("!Hi!",100));
    System.out.println(remove("!!!Hi !!hi!!! !hi",1));
    System.out.println(remove("!!!Hi !!hi!!! !hi",3));
    System.out.println(remove("!!!Hi !!hi!!! !hi",5));
    System.out.println(remove("!!!Hi !!hi!!! !hi",100));
  } // main()
} // Kata4
