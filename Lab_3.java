import java.util.*;
class Lab_3{
public static void main(String args[]){
	System.out.println("\n==================================");
        System.out.println("1. ARRAYLIST DEMONSTRATION ");
        System.out.println("==================================");
        
        ArrayList<String> list = new ArrayList<>();
        list.add("C++");
        list.add("Java");
        list.add("Python");
        System.out.println("After additions: " + list);
        System.out.println("Contains 'Java'?: " + list.contains("Java"));
        System.out.println("Index of 'Python': " + list.indexOf("Python"));
        System.out.println("Removed item at index 0: " + list.remove(0));
        System.out.println("After remove(index): " + list);
        System.out.println("Total size of ArrayList: " + list.size()); 

        System.out.println("\n=======================================");
        System.out.println("2. HASHSET DEMONSTRATION");
        System.out.println("=======================================");
        
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        System.out.println("HashSet elements: " + set);
        System.out.println("Contains 'Blue'?: " + set.contains("Blue"));
        System.out.println("Size of HashSet: " + set.size());
        set.remove("Green");
        System.out.println("After removing 'Green': " + set);
        set.clear();
        System.out.println("Is HashSet empty after clear()?: " + set.isEmpty());
	

	System.out.println("\n=======================================");
	System.out.println("3. HASHMAP DEMONSTRATION");
    System.out.println("=======================================");
	HashMap<Integer,String> H=new HashMap<>();
	H.put(101,"Alice");
	H.put(102,"Bob");
	H.put(103,"Charlie");
	System.out.println("HashMap: "+H);
	System.out.println("Employee with ID 102: "+H.get(102));
	System.out.println("Contains Key 104? : "+H.containsKey(104));
    System.out.println("Contains Value 'Alice'?: "+H.containsValue("Alice"));
    System.out.print("Remove 102: ");
	H.remove(102);
	System.out.println(H);
}
}