import java.util.Scanner;

public class CWH_Practice_Problems {

    public static void main(String[] args) {
        // Initialize integers
        double a,b,c;

        //Initialize Scanner
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        //Initialize total as double to save answer
        double total;

        //Substitute formula for total
        total = a + b + c;

        //Print your final answer
        System.out.println(total);

    }
}
