public class ForEachDemo {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5};

        // Traditional loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhanced for-each loop
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
