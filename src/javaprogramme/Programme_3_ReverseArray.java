package javaprogramme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        Integer[] originalArray = {5, 10, 15, 20, 25, 30, 35, 40};

        System.out.println("Original Array:");
        printArray(originalArray);

        reverseArray(originalArray);

        System.out.println("Reversed Array:");
        printArray(originalArray);
    }

    // Function to reverse an array
    public static void reverseArray(Integer[] arr) {
        List<Integer> list = new ArrayList(List.of(arr));
        Collections.reverse(list);
        list.toArray(arr);
    }

    // Function to print an array
    public static void printArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
