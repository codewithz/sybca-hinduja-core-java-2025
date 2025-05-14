import java.io.*;
public class ReadFile {
    
    public static void main(String[] args) {
        
        // Write a program to read from the file only using FileReader 
        try (FileReader fileReader = new FileReader("details.txt")) {
            int character;
            while ((character = fileReader.read()) != -1) {
            System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }




    }
}
