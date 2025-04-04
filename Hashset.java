import java.util.*;    
class Hashset {    
    public static void main(String args[]) {    
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Grapes");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Apple");
        set2.add("Grapes");

        System.out.println("Are sets equal? " + set1.equals(set2));  // true
    }
}