package javaprogramme;

import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> child = new HashMap();
        //Hashmap with key -value pair(name, age)
        child.put("Vini", 10);
        child.put("Arnav", 12);
        child.put("Mishka", 11);
        child.put("Siddh", 13);
        child.put("Harvi", 14);

        //for-each loop to iterate the value in the map
        System.out.println("Age of child in the HashMap:");
        for (Integer age : child.values()) {
            System.out.println(age);
        }
    }
}
