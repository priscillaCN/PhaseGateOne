import java.util.Scanner;
public class TaskSeven {

    public static void main(String[] args) {

        int sum = 0;

        Scanner collectInput = new Scanner(System.in);

        for(int count = 1; count <= number; count++) {

            System.out.println("Enter a number:");
            int number = collectInput.nextInt();
            sum += number;
        }

        System.out.println("The sum is: " + sum);

    }

}
