import java.util.concurrent.atomic.AtomicReference;

public class Kata7 {
  public static void _if(Boolean bool, Runnable func1, Runnable func2) {
    if (bool != null && bool) {
      func1.run();
    } else {
      func2.run();
    }
  } // _if()

  public static void main(String[] args) {
    AtomicReference<String> actual = new AtomicReference<>("no function");
    Kata7._if(true, () -> actual.set("true function"), () -> actual.set("false function"));
    System.out.println(actual.get());
    Kata7._if(false, () -> actual.set("true function"), () -> actual.set("false function"));
    System.out.println(actual.get());
    Kata7._if(null, () -> actual.set("true function"), () -> actual.set("false function"));
    System.out.println(actual.get());
  } // main()
} // Kata7
