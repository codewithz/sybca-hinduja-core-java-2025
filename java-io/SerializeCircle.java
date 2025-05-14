import java.io.*;

public class SerializeCircle {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("circle.dat"));
        oos.writeObject(new Circle(10));
        oos.close();
    }
}
