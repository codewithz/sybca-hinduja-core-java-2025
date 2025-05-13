public class MultiCatchDemo {
    public static void main(String[] args) {
        try {

            // Example of an arithmetic exception
            int x = 10;
            int y = 10;
            int result = x / y; // Throws ArithmeticException
            System.out.println("Result: " + result);

            String str = null;
            System.out.println(str.length()); // Throws NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic problem");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Object was null!");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("General exception: " + e);
        }
    }
}
