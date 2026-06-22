class Shape { 
  // Method for calculating Circle Area
  double area(double radius) {
    return Math.PI * radius * radius;
  } 
  // Method for calculating Rectangle Area 
  double area(double length, double width) { 
    return length * width;
  }
}
public class Main { 
  public static void main(String[] args) { 
    // Creating Object
    Shape shape = new Shape();
    // Calculating Areas
    double circleArea = shape.area(7.0); 
    double rectangleArea = shape.area(5.0, 10.0);
    // Displaying Results
    System.out.println("Circle Area: " + circleArea);
    System.out.println("Rectangle Area: " + rectangleArea);
  }
} 
