public class NameMe {
  public String firstName;
  public String lastName;
  public String fullName;

  public NameMe(String first, String last) {
    this.firstName = first;
    this.lastName = last;
    this.fullName = first + " " + last;
  } // NameMe()

  public String getFirstName() {
    return this.firstName;
  } // getFirstName()

  public String getLastName() {
    return this.lastName;
  } // getLastName()

  public String getFullName() {
    return this.fullName;
  } // getFullName()

  public static void main(String[] args) {
    NameMe nameMe = new NameMe("John", "Doe");
    System.out.println(nameMe.getFirstName()); // Expected: John
    System.out.println(nameMe.getLastName()); // Expected: Doe
    System.out.println(nameMe.getFullName()); // Expected: John Doe
  } // main()
} // NameMe
