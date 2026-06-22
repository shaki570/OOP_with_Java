public class Calculator {
  // Method for adding 2 integers
  int add(int a, int b) { 
    return a + b;                  
 } 
// Method for adding 2 double numbers 
  double add(double a, double b) { 
    return a + b;
  // Method for adding 3 integers
    int add(int a, int b, int c) { 
      return a + b + c;
    }
    public static void main(String[] args) {
      // Creating Object
      Calculator calc = new Calculator();
      // Calling Methods 
      System.out.println( 
        "Sum of two integers   : "
        + calc.add(10, 20)
      ); 
      System.out.println(
        "Sum of two doubles    : "
        + calc.add(5.5, 4.5)
      );
      System.out.println(
        "Sum of three integers : "
        + calc.add(10, 20, 30) 
      );
    }
  } 
