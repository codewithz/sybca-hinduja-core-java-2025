import java.io.*;

public class ReadFileUsingBufferedReader {
    public static void main(String[] args) {
        
    BufferedReader reader = null;
    try {
        File file = new File("details.txt"); // Replace with your file path
        FileReader fileReader = new FileReader(file);
        reader = new BufferedReader(fileReader);

        String line;
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (reader != null) {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

    }
}
