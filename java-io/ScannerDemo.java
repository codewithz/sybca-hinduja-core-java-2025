
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a float: ");
        float inputFloat = scanner.nextFloat();

        System.out.print("Enter a long: ");
        long inputLong = scanner.nextLong();

        System.out.println("You entered:");
        System.out.println("String: " + inputString);
        System.out.println("Float: " + inputFloat);
        System.out.println("Long: " + inputLong);

        scanner.close();

    }

    
}
