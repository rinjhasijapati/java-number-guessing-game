import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj1 = new Scanner(System.in);
        int R =5; //given number of rounds
        int i=0, guess;

        //let the computer generate a random number between 1-10
        Random random = new Random();
        int number = random.nextInt(10);


        //create a loop for number of rounds
        for(i=0; i<R; i++){
            System.out.println("Guess a number between 1-10");
            guess = obj1.nextInt();

            //check condition
            if(number == guess){
                System.out.println("Congratulations!! You guessed the correct number.");
                break;
            }else if(number > guess && i!=R-1){
                System.out.println(guess + " is too low. Try guessing a higher number.");
            }else if(number < guess && i!=R-1) {
                System.out.println(guess + " is too high. Try guessing a lower number.");
            }
        }

        if(i == R){
            System.out.println("You have used all of your chances.:(");
            System.out.println("The number was " + number);
        }
    }
}