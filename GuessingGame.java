import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random obj1 = new Random();
        Scanner obj2 = new Scanner(System.in);
    
        int guessingNumber =obj1.nextInt(100)+1;
        int tryCount=0;


        while(true) {
            System.out.println("Enter your guess (1-100):");
            
            int playerGuess = obj2.nextInt();
            tryCount++;
            
            if (playerGuess == guessingNumber) {
              System.out.println("Congrats! You win the game");
              System.out.println("You took " + tryCount + " tries");
              break;
            }
            else if(guessingNumber > playerGuess) {
              System.out.println("No! The number is higher. Guess again.");
            }
            else {
              System.out.println("No! The number is lower. Guess again.");
            }
          }
          
          
          

    
    
    
    }
}
