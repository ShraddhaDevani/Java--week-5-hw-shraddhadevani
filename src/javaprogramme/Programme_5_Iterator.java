package javaprogramme;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_Iterator {
    public static void main(String[] args) {
        //Create an ArrayList of to store roll number
        ArrayList<Integer> rollNumber = new ArrayList<>();
        //Add elements to the ArrayList
        rollNumber.add(20);
        rollNumber.add(25);
        rollNumber.add(30);
        rollNumber.add(37);

        // Create an Iterator to iterate through the ArrayList
        Iterator<Integer> iterator = rollNumber.iterator();

        //Iterate and print each element using Iterator
        System.out.println("Elements in the ArrayList using Iterator: ");
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(rollNumber);
        }

    }
}
