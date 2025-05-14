import java.io.*;

public class WriteToFileUsingBufferedWriter {
    public static void main(String[] args) {
        
        BufferedWriter writer = null;
        try {
            File file = new File("results.txt");
            writer = new BufferedWriter(new FileWriter(file));
            writer.write("Hello, this is a test message.");
            writer.newLine();
            writer.write("Writing to a file using BufferedWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        }

    }
}
