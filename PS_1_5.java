//Write a Java program to detect whether a number entered by the user is an integer or not.

import java.util.Scanner;

public class Practice_Problems {

    public static void main(String[] args) {
        //Initialize a Boolean
        boolean ans;
        
        //Initialize a scanner
        Scanner sc = new Scanner(System.in);
        ans = sc.hasNextInt();

        //Use if-else statement to determine whether input is integer or not
        if (ans){
            System.out.println("The entered number is an integer");
        }
        else {
            System.out.println("The entered number is not an integer");
        }

    }
}
