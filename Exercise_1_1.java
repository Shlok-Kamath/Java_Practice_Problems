//  Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)

import java.util.Scanner;

public class Practice_Problems {

    public static void main(String[] args) {
        // Initialize integers
        int marks1, marks2, marks3, marks4,marks5;
        
        //Initialize Scanner
        Scanner sc = new Scanner(System.in);
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        marks4 = sc.nextInt();
        marks5 = sc.nextInt();
        
        //Initialize percentage as double to save answer
        double percentage;
        
        //Substitute formula for percentage
        percentage = ( marks1 + marks2 + marks3 + marks4 + marks5 )/5.0;
        
        //Print your final answer
        System.out.println(percentage);

    }
}
