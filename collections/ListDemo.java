import java.util.*;

public class ListDemo {


    public static void main(String[] args) {
       
        // Create a list of Strings
        List<String> list = new ArrayList<>();
        // Add elements to the list
        list.add("Cherry");
        list.add("Apple");
        list.add("Banana");
    

        // Print the list
        System.out.println("List before sorting: " + list);
        // Sort the list
        Collections.sort(list);
        // Print the sorted list
        System.out.println("List after sorting: " + list);

        // Remove an element from the list
        list.remove("Banana");
        // Print the list after removal
        System.out.println("List after removal: " + list);
        // Get an element from the list
        String firstElement = list.get(0);
        // Print the first element
        System.out.println("First element: " + firstElement);

        // Iterate over the list using a for-each loop
        System.out.println("Iterating over the list:");
        for (String fruit : list) {
            System.out.println(fruit);
        }   

    }


    
}
