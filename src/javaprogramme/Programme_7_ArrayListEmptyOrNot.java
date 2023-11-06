package javaprogramme;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_ArrayListEmptyOrNot {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        //Check if the ArrayList is empty
        if (cars.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        //Create carList of Integers
        ArrayList<String> carList = new ArrayList();
        //Add some elements to the carList
        carList.add("Audi");
        carList.add("BMW");
        carList.add("Toyota");

        // Check if the ArrayList is empty
        if (carList.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }


    }
}
