public class DivisionDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try {
            int result = x / y;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Oops! You tried dividing by zero: " + e);
        } finally {
            System.out.println("Operation attempted. Exiting now.");
        }
    }
}
