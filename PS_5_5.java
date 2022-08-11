import java.util.Scanner;

public class CWH_Practice_Problems {

    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        int factorial = 1;
        for(int i=1 ; i<=n ; i++){

            factorial*=i;
        }

        System.out.println("Factorial of "+n+": "+factorial);
    }
}
