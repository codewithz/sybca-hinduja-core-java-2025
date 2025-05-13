
import java.util.*;
public class SetDemo {
    //Generate code to create a set of String and add code to demonstrate the functions of set and also show the difference between HashSet, LinkedHashSet and TreeSet
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");

        // Display the HashSet
        System.out.println("HashSet: " + hashSet);

        // Create a LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");

        // Display the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Create a TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Grapes");

        // Display the TreeSet
        System.out.println("TreeSet: " + treeSet);
    }

}
