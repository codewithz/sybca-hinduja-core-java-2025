public class CustomExceptionDemo {
    public static void main(String[] args) {
        int slices = 17;
        try {
            if (slices > 8) {
                throw new TooMuchPizzaException("Too much pizza can make you sleepy!");
            } else {
                System.out.println("Enjoy your meal!");
            }
        } catch (TooMuchPizzaException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}

