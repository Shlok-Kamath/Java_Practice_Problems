//Write a Java program that asks the user to enter his her name and greets them with “Hello <name>, have a good day” text

import java.util.Scanner;

public class Practice_Problems {

    public static void main(String[] args) {
        // Initialize string
        String name;

        //Initialize Scanner
        Scanner sc = new Scanner(System.in);
        name=sc.nextLine();

        //Print your line
        System.out.println("Hello "+ name+", have a good day");

    }
}
