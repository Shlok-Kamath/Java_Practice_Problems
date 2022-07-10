//Write a program to calculate CGPA using marks of three subjects (out of 100)

import java.util.Scanner;

public class Practice_Problems {

    public static void main(String[] args) {
        // Initialize integers
        int a,b,c;

        //Initialize Scanner
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        //Initialize total as double to save answer
        double CGPA;

        //Substitute formula for CGPA
        CGPA = (a + b + c)/30;

        //Print your final answer
        System.out.println(CGPA);

    }
}
