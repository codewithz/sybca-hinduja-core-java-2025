
import java.util.*;
public class QueueDemo {
    public static void main(String[] args) {
        
        // Create a queue
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Display the queue
        System.out.println("Queue: " + queue);

        // Remove an element from the queue
        String removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);

        // Display the queue after removal
        System.out.println("Queue after removal: " + queue);

    }
}
