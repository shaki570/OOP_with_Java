public class Bike {

    String brand;
    String model;
    double price;

    // Constructor
    public Bike (String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display Bike details
    public void displayBike() {
        System.out.println("--- Bike Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        Bike myBike = new Bike("YAMAHA", "Yamaha XSR 155 ", 2500.50);
        myBike.displayBike();
    }
}
