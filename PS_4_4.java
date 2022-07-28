import java.util.Scanner;

public class CWH_Practice_Problems {

    public static void main(String[] args) {

        int year =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter the year: ");
        year = scanner.nextInt();

        if (year%100 == 0){
            if (year%400 == 0){
                System.out.println(year+" is a leap year.");
            }
            else {
                System.out.println(year+" is not a leap year.");
            }
        }
        else {
            if (year%4 == 0){
                System.out.println(year+" is a leap year.");
            }
            else {
                System.out.println(year+" is not a leap year.");
            }
        }

    }
}
