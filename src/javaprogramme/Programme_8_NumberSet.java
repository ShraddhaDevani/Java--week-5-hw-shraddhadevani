package javaprogramme;
/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;

public class Programme_8_NumberSet {
    public static void main(String[] args) {
        // Create a HashSet to store Integer objects
        HashSet<Integer> numberSet = new HashSet();

        //Store the numbers 4, 7 and 8 in set.
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        // Check which numbers between 1 and 10 are in the set
        System.out.println("Number between 1 to 10 that are in the set: ");

        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i + " is in the set.");
            } else {
                System.out.println(i + " is not in the set.");
            }
        }

    }
}
