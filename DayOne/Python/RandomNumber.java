import java.util.Scanner;
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        Random random = new Random();

        int randomNumber = random.nextInt(100);

        int count = 0;
        int userGuess = 0;

        for(count = 0; count <= 5; count ++) {

            System.out.println("Guess the lucky number:");
            userGuess = collectInput.nextInt();

            if(userGuess < randomNumber) 
                System.out.println("wrong! your guess is too low");

            else if(userGuess > randomNumber && userGuess <= 100) 
                System.out.println("wrong! your guess is too high");

            else if(userGuess > 100) {
                System.out.println("wrong! your guess is not within range");
                   count += -1;
            }

            else
                break;

        }

        String rating = "";

        if (randomNumber == userGuess) {

            switch(count) {
                case 1 -> rating = "Legendary";
                case 2 -> rating = "Excellent";
                case 3 -> rating = "Good";
                case 4 -> rating = "Good";
                case 5 -> rating = "Close";
            }

        }

        else
            rating = "Better luck";

        System.out.println("Random number:" + randomNumber);
        System.out.println("Number of attempts:" + count);
        System.out.println("rating:" + rating);

    }

}
