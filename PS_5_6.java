import java.util.Scanner; 

public class Practice_Problems {

    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        int factorial = 1;
        while(n!=0){

            factorial*=n;
            n--;
        }

        System.out.println("Factorial is: "+factorial);
    }
}
