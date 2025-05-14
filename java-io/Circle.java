import java.io.*;

public class Circle implements Serializable {
    int radius;
    float area;

    public Circle(int radius) {
        this.radius = radius;
        this.area = (float)(Math.PI * radius * radius);
    }
}