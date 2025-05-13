public class ThrowsDemo {
    public static void main(String[] args) throws Exception  {
        System.out.println("Sleeping...");
        Thread.sleep(1000); // Can throw InterruptedException
        System.out.println("Awake!");
    }
}