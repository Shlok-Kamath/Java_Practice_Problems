//Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

import java.util.Scanner;

public class Practice_Problems {

    public static void main(String[] args) {
        //Initialize a String
        char grade='S';

        //Print actual grade
        System.out.println("Actual grade is: "+grade);

        //Add 8 to encrypt
        grade+=8;

        //Print coded grade
        System.out.println("Coded grade is: "+grade);

        //Subtract 8 to decrypt
        grade-=8;

        //Print decoded grade
        System.out.println("decoded grade is: "+grade);

    }
}
