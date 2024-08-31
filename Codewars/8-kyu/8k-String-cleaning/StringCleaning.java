class StringCleaning {
  static String stringClean(final String text) {
    return text.replaceAll("\\d", "");
  } // stringClean()

  public static void main(String[] args) {
    System.out.println(stringClean("! !"));
    System.out.println(stringClean("123456789"));
    System.out.println(stringClean("This looks5 grea8t!"));
  } // main()
} // StringCleaning
