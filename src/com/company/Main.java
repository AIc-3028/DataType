package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //creates an array of strings
        // Anything in the {} are elements
        String[] fruit = {"apples", "oranges", "pears"};
        System.out.println(fruit[0]);
        System.out.println(fruit.length);

//creates an array of integers
        int[] classSize;

//creates an array of boolean
        boolean[] brokenLights;

//creates an array of names
        String[] names = {"John", "Daryl", "Mike", "Sarah", "Michelle"};

        String[] my_array = {"mary", "sybil", "edith"};

        System.out.printf(my_array[0]);
        // returns "sybil"

        String[] my_array2 = {"Aaron", "Joan", "Layla"};

        System.out.printf(my_array2[1]);
        // returns "Joan"
        int size = my_array.length;
        System.out.println(size);
        // returns the length or size of the array (3)

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(2);
        integers.add(6);
        integers.add(5);
        integers.add(2);

        System.out.println(integers);

        integers.add(1, 9);

        System.out.println(integers);

        integers.remove(3);
        System.out.println(integers);
//        Collection.reverse(integers);
//        System.out.println(Collection.reverse(integers))
        System.out.println(integers.contains(6));

        //Create a new string
        String myString = "I really love ice cream!";

//Create another string that holds the split version of the first
//        String str[] = myString.split(" ");

//Use the List class to create a new ArrayList
        List<String> arrayString = new ArrayList<String>();

//Store the contents of our split string as elements in
//arrayString using the Array.asList to convert the string into an array
//        arrayString = Arrays.asList(str);
        //Turns the string myString into an array

//        String myStr = "I really love ice cream!";
//        String str[] =myStr.split(" ");
//        List<String> arrayString = new

        HashMap<String, Integer> person = new HashMap<>();

        person.put("Mike", 23);
        person.put("Ellen", 34);
        person.put("Jamie. F", 17);
        person.put("Fred", 17);
        person.put("Jamie. W", 34);

        System.out.println(person);


        System.out.println(person.get("Ellen"));
        System.out.println(person.containsValue(45));
        System.out.println(person.isEmpty());

        String[] myStrings = {"String1", "String2", "String3"};

        for (int i = 0; i < myStrings.length; i++) {
            System.out.println(myStrings[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("I think I can");
        }

        int count = 0;

        for (int i = 1; i <= 10; i++) {
            count *= count;
            System.out.println(count);
            count = i;
        }

        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("blue");
        colors.add("green");

        for (String color : colors) {
            System.out.println(color);
        }

//        for (Map.Entry<String, Integer>) entry : person.entrySet()]{
//
//
//    }


    }
}
