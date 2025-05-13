import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        // Generate code to create a map with 5 elements using SortedMap and add code to
        // demonstrate the functions of map and also show the difference between
        // HashMap, LinkedHashMap and TreeMap
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 3);
        hashMap.put("Grapes", 4);
        hashMap.put("Mango", 5);
        // Display the HashMap
        System.out.println("HashMap: " + hashMap);
        // Create a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Orange", 3);
        linkedHashMap.put("Mango", 5);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Grapes", 4);

        // Display the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

   
        // Create a SortedMap
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Apple", 1);
        sortedMap.put("Banana", 2);
        sortedMap.put("Orange", 3);
        sortedMap.put("Grapes", 4);
        sortedMap.put("Mango", 5);
        // Display the SortedMap
        System.out.println("SortedMap: " + sortedMap);

        
        // Demonstrate the functions of map
        // Get the value associated with a key
        int value = hashMap.get("Apple");
        System.out.println("Value associated with key 'Apple': " + value);
        // Check if a key exists
        boolean containsKey = hashMap.containsKey("Banana");
        System.out.println("HashMap contains key 'Banana': " + containsKey);
        // Check if a value exists
        boolean containsValue = hashMap.containsValue(3);
        System.out.println("HashMap contains value 3: " + containsValue);
        // Remove a key-value pair
        hashMap.remove("Grapes");
        System.out.println("HashMap after removing key 'Grapes': " + hashMap);
        // Iterate over the keys
        System.out.println("Iterating over keys in HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
        // Iterate over the values
        System.out.println("Iterating over values in HashMap:");
        for (int val : hashMap.values()) {
            System.out.println(val);
        }
        // Iterate over the key-value pairs
        System.out.println("Iterating over key-value pairs in HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Clear the map
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);

    }

}
