import java.io.*;

public class DesrializeCircle {
    public static void main(String[] args) throws Exception {
     ObjectInputStream ois = new ObjectInputStream(new FileInputStream("circle.dat"));
    Circle c = (Circle) ois.readObject();
    System.out.println("Radius: " + c.radius);
    ois.close();
    }
}
