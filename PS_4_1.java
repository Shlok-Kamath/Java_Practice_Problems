import java.util.Scanner;

public class Practice_Problems {

    public static void main(String[] args) {

        int mark1 =0;
        int mark2 =0;
        int mark3 =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter mark in Subject 1: ");
        mark1 = scanner.nextInt();

        System.out.println("PLease enter mark in Subject 2: ");
        mark2 = scanner.nextInt();

        System.out.println("PLease enter mark in Subject 3: ");
        mark3 = scanner.nextInt();

        double avg = (mark1 + mark2 + mark3)/3.0;

        if (mark1 >= 33 && mark2 >= 33 && mark3 >= 33 && avg >= 40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
