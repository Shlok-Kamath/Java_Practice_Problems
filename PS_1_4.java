//Write a Java program to convert Kilometers to miles.

import java.util.Scanner;

public class Practice_Problems {

    public static void main(String[] args) {
        // Initialize double
        double distance_in_km;

        //Initialize Scanner
        Scanner sc = new Scanner(System.in);
        distance_in_km=sc.nextDouble();

        //Initialize double to store the answer
        double distance_in_miles;

        //Substitute Formula
        distance_in_miles = distance_in_km*0.621371;

        //Print your answer
        System.out.println("Distance in miles is: " + distance_in_miles);

    }
}
