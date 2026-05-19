import java.util.Scanner;

public class TaskTen {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int numberOne = collectInput.nextInt();

        System.out.println("Enter second number: ");
        int numberTwo = collectInput.nextInt();

        System.out.println("Enter third number: ");
        int numberThree = collectInput.nextInt();


        int average = (numberOne + numberTwo + numberThree) / 3;

        System.out.println("The average is: " + average);
    }

}
