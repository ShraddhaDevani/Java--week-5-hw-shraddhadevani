package javaprogramme;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElementAtIndex {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);

        // Create a new ArrayList to store elements
        ArrayList<String> arrayList = new ArrayList();

        //Array list with fruit name
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Grapes");

        System.out.println("Enter the index to retrieve an elements:");

        int index = scanner.nextInt();

         // Check if the specified index is valid or invalid
        if (index >= 0 && index < arrayList.size()) {
            String element = arrayList.get(index);
            System.out.println("Element at index " + index + " is: " + element);
        } else {
            System.out.println("Invalid index. Please enter a valid index within the ArrayList size.");
        }
        scanner.close();

    }
}
