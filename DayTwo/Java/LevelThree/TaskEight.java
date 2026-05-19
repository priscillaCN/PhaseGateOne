import java.util.Scanner;

public class TaskEight {

    public static void main(String[] args) {


        int sum = 0;

        Scanner collectInput = new Scanner(System.in);
         System.out.println("Enter a number:");
         int number = collectInput.nextInt();

        while(number != 0) {

             sum += number;

            System.out.println("Enter a number:");
            number = collectInput.nextInt();
        }


        System.out.println("The sum is: " + sum);

    }

}
