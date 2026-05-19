import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {

        int sum = 0;

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = collectInput.nextInt();

        for(int count = 1; count <= number; count++) {
            sum += count;
            }

        System.out.println("The sum of " + number + " is: " + sum);

    }

}
