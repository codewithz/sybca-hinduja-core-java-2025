package packages.src;

public class Circle extends Shape {
    // Implement the abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    // You can also add additional methods or properties specific to Circle here
    public void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
    
}
