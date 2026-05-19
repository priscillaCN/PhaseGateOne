import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {

        int factorial = 1;

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = collectInput.nextInt();

        for(int count = number; count >= 1; count--) {
            factorial *= count;
            }

        System.out.println("The factorial of " + number + " is: " + factorial);

    }

}
