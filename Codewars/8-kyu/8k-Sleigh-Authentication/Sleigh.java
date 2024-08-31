public class Sleigh {
    public static Boolean authenticate(String name, String password){
      return name.equals("Santa Claus") && password.equals("Ho Ho Ho!");
    } // authenticate()

    public static void main(String[] args) {
        System.out.println(authenticate("Santa Claus", "Ho Ho Ho!"));
        System.out.println(authenticate("Santa", "Ho Ho Ho!"));
        System.out.println(authenticate("Santa Claus", "Ho Ho!"));
        System.out.println(authenticate("jhoffner", "CodeWars"));
    } // main()
  } // Sleigh