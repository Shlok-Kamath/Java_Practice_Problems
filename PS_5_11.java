import java.util.Scanner;

 public class CWH_Practice_Problems {

    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        int total = 0;
        for (int i = 0; i<=n ; i++){

            total += 2*i;
        }

        System.out.println("Total is: "+total);
    }
}
