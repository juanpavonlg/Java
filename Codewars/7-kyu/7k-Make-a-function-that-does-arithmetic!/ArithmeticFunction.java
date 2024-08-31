class ArithmeticFunction {
  public static int arithmetic(int a, int b, String operator) {
    switch (operator) {
      case "add":
        return a + b;
      case "subtract":
        return a - b;
      case "multiply":
        return a * b;
      case "divide":
        return a / b;
    }
    return 0;
  } // arithmetic()

  public static void main(String[] args) {
    System.out.println(arithmetic(5, 2, "add"));
    System.out.println(arithmetic(5, 2, "subtract"));
    System.out.println(arithmetic(5, 2, "multiply"));
    System.out.println(arithmetic(5, 2, "divide"));
  } // main()
} // ArithmeticFunction
