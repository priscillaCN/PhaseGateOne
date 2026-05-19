import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = collectInput.nextInt();

        int futureAge = age + 5;

        System.out.println("you will be " + futureAge + " in 5 years");
    }

}
