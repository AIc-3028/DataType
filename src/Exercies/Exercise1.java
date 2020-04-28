package Exercies;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int sum = 0;
        int product = 1;

        System.out.println("Please Type five Numbers: ");

        for (int i = 0; i < 5; i++){
            int input = scn.nextInt();
            integers.add(input);
        }

        System.out.println("Here is your list: " + integers);

        for (int integor : integers){
            sum += integor;
            product *= integor;
        }

        System.out.println("Here is your Sum: " + sum );
        System.out.println("Here is your Product: " + product );



        HashMap<String, String> vehicles = new HashMap<>();

        vehicles.put("Civic", "Honda");
        vehicles.put("Corolla", "Toyota");
        vehicles.put("Rav-4", "Toyota");

        System.out.println("What car are you looking for?");
        String reply = scn.nextLine();

        if (vehicles.containsValue(reply)){
            System.out.println("Excellent, It seems we have just the thing");
            System.out.println("Here are our " + vehicles.get(reply) + " selection");

//          TODO: find a way to return all valaes that match depending
        } else {
            System.out.println("It seems we don't have that ...");
        }

    }
}
