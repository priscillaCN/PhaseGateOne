import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int number = collectInput.nextInt();

        String message = "";

        if(number >= 0) 
            message = "number is positive";

        else
            message = "number is negative";

        System.out.println(message);
    }

}
