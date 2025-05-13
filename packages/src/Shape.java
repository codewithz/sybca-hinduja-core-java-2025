package packages.src;    

public abstract class Shape {
    
    // Abstract method (does not have a body)
    public abstract void draw();

    // Regular method
    public void display() {
        System.out.println("This is a shape.");
    }

}
