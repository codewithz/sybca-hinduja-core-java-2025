package packages.src;

public class Square extends Shape {
    // Implement the abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }

    // You can also add additional methods or properties specific to Square here
    public void calculateArea(double side) {
        double area = side * side;
        System.out.println("Area of the square: " + area);
    }
    
}
