import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // 1. Adding elements
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "Anju");


        System.out.println("After adding elements: " + students);

        
        students.put(102, "Maria"); // change the value for key 102

        System.out.println("After updating key 102: " + students);

      
        students.remove(103); // Removes entry with key 103

        System.out.println("After removing key 103: " + students);
    }
}