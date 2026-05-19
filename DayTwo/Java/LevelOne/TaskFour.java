import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int numberOne = collectInput.nextInt();

        System.out.println("Enter second number: ");
        int numberTwo = collectInput.nextInt();

        int product = numberOne * numberTwo;

        System.out.println("The product is: " + product);
    }

}
