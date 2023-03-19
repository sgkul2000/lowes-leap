import java.util.*;

public class CollectionFrameworkExample {
    
    public static void main(String[] args) {
        
        // HashSet implementation
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        System.out.println("HashSet: " + hashSet);
        
        // TreeSet implementation
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println("TreeSet: " + treeSet);
        
        // ArrayList implementation
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(7);
        System.out.println("ArrayList: " + arrayList);
        
        // HashMap implementation
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 3);
        hashMap.put("banana", 5);
        hashMap.put("orange", 2);
        System.out.println("HashMap: " + hashMap);
        
        // TreeMap implementation
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 3);
        treeMap.put("banana", 5);
        treeMap.put("orange", 2);
        System.out.println("TreeMap: " + treeMap);
        
        // Hashtable implementation
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("apple", 3);
        hashtable.put("banana", 5);
        hashtable.put("orange", 2);
        System.out.println("Hashtable: " + hashtable);
    }
}
