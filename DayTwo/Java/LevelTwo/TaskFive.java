import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int numberOne = collectInput.nextInt();

        System.out.println("Enter second number: ");
        int numberTwo = collectInput.nextInt();

        System.out.println("Enter third number: ");
        int numberThree = collectInput.nextInt();

        int largest = numberOne;

        if(numberTwo > numberOne && numberTwo > numberThree)
            largest = numberTwo;

        if(numberThree > numberOne && numberThree > numberTwo)
            largest = numberThree;

        System.out.println("The largest number is: " + largest);
    }

}
