import java.util.Scanner;
import java.util.Random;

class GuessTheNumber{
    int ans;
    int a;
    int numberOfGuesses = 0;
    Random random = new Random();
    public GuessTheNumber(){
        ans  = random.nextInt(200);
    }

    public void setNumberOfGuesses(){
        numberOfGuesses++;
    }

    public void takeUserInput(int b){

        a=b;
    }

    public boolean isCorrectNumber(){
        if (a==ans){
            System.out.printf("Yes!! You guessed it right in %d attempts",numberOfGuesses);
            return true;
        }
        else if (a>ans) {
            System.out.println("Please enter lower number");
            return false;
        }
        else{
            System.out.println("Please enter higher number");
            return false;
        }
    }
}

public class Practice_Problems {

    public static void playGame(){

        GuessTheNumber guessTheNumber = new GuessTheNumber();
        boolean value = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your guess: ");

        while (!value){
            int a = scanner.nextInt();
            guessTheNumber.takeUserInput(a);
            guessTheNumber.setNumberOfGuesses();
            value = guessTheNumber.isCorrectNumber();
        }

        System.out.println("\nDo you want to play this game again 'Y' or 'N': ");
        scanner.nextLine();
        String play = scanner.nextLine();
        if (play.equals("Y")) {
            playGame();
        }
    }

    public static void main(String[] args) {

        playGame();

    }
}
