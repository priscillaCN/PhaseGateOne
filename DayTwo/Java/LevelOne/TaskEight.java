import java.util.Scanner;

public class TaskEight {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int number = collectInput.nextInt();

        System.out.println("The square is: " + (number * 2));
    }

}
