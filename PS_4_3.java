import java.util.Scanner;

public class Practice_Problems {

    public static void main(String[] args) {

        int day =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter the day: ");
        day= scanner.nextInt();
      
      // Use switch statement instead of if else to make programme better
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }
    }
}
