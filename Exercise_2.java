import java.util.Objects;
import java.util.Scanner;

public class Excercise {

    public static void main(String[] args) {

        System.out.println("Welcome to rock paper and scissors");

        Scanner scan = new Scanner(System.in);

        String input;
        System.out.println("PLease choose rock, paper or scissors: ");
        input = scan.nextLine();

        String [] arr = {"rock", "paper", "scissors"};
        int b = (int)(Math.random()*3);

        String computer = arr[b];
        System.out.println("Computer chose: "+computer);



        if (Objects.equals(input, "rock") && computer.equals("paper")){
            System.out.println("Sorry! Computer won.");
        }
        else if (Objects.equals(input, "paper") && computer.equals("scissors")){
            System.out.println("Sorry! Computer won.");
        }
        else if (Objects.equals(input, "scissors") && computer.equals("rock")){
            System.out.println("Sorry! Computer won.");
        }
        else if (Objects.equals(input, "paper") && computer.equals("rock")){
            System.out.println("Congrats! You won.");
        }
        else if (Objects.equals(input, "scissors") && computer.equals("paper")){
            System.out.println("Congrats! You won.");
        }
        else if (Objects.equals(input, "rock") && computer.equals("scissors")){
            System.out.println("Congrats! You won.");
        }
        else{
            System.out.println("It's a tie");
        }

    }
}
