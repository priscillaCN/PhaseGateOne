import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int number = collectInput.nextInt();

        String message = "";

        if(number % 2 == 0) 
            message = "number is even";

        else
            message = "number is odd";

        System.out.println(message);
    }

}
