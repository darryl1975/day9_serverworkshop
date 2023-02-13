package sg.edu.nus.iss;

import java.util.Random;
import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        // need the random class to carry out randomize operation
        Random random = new Random();

        // generate random number between 0 and 99
        Integer randomNumber = random.nextInt(100);

        // store my guess
        Integer myGuess = 0;

        // expect input from keyboard
        // convert to expect from inputStream if its a socket app
        Scanner scanner = new Scanner(System.in);
        
        // allow user to guess until they got the random number correct
        while (myGuess != randomNumber) {
            myGuess = scanner.nextInt();

            if (myGuess < randomNumber) {
                System.out.println("Your guessed number is lower.");
            } else if (myGuess > randomNumber) {
                System.out.println("Your guessed number is higher");
            } else {
                System.out.println("you have finally guessed it right!");
                scanner.close();
            }
        }
        
    }
}
