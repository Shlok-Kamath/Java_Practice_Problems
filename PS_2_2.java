//Use comparison operators to find out whether a given number is greater than the user entered number or not.

import java.util.Scanner;

public class CWH_Practice_Problems {

    public static void main(String[] args) {
        //Initialize a integer
        int a=19;

        //Declare another integer for input
        int b;

        //Initialize Scanner
        Scanner sc = new Scanner(System.in);
        b=sc.nextInt();

        //Use if-else to check greater than or not
        if (a>b){
            System.out.println("Entered number is greater than given number");
        }
        else {
            System.out.println("Entered number is not greater than given number");
        }

    }
}
