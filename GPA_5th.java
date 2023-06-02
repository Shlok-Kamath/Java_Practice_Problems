import java.util.Objects;
import java.util.Scanner;

public class Main{

    public static double calculator(double b){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(Objects.equals(a, "S")) return 10*b;
        else if(Objects.equals(a, "A")) return 9*b;
        else if(Objects.equals(a, "B")) return 8*b;
        else if(Objects.equals(a, "C")) return 7*b;
        else if(Objects.equals(a, "D")) return 6*b;
        else if(Objects.equals(a, "E")) return 5*b;
        else return 0;
    }

    public static void main(String[] args) {
        double total=0;
        System.out.println("Please enter your Math theory grade in capitals: ");
        total+=calculator(3);
        System.out.println("Please enter your Math lab grade in capitals: ");
        total+=calculator(1);
        System.out.println("Please enter your ML/Software/Compiler theory grade in capitals: ");
        total+=calculator(3);
        System.out.println("Please enter your ML/Software/Compiler lab grade in capitals: ");
        total+=calculator(1);
        System.out.println("Please enter your DBMS/DAA theory grade in capitals: ");
        total+=calculator(3);
        System.out.println("Please enter your DBMS/DAA lab grade in capitals: ");
        total+=calculator(1);
        System.out.println("Please enter your CN/OS theory grade in capitals: ");
        total+=calculator(3);
        System.out.println("Please enter your CN/OS lab grade in capitals: ");
        total+=calculator(1);
        System.out.println("Please enter your IOT theory grade in capitals: ");
        total+=calculator(1);
        System.out.println("Please enter your IOT lab grade in capitals: ");
        total+=calculator(1);
        System.out.println("Please enter your STS grade in capitals: ");
        total+=calculator(1.5);

        System.out.println("Your GPA is: "+total/19.5);

    }
}
