import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {


        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter any year: ");
        int year = collectInput.nextInt();

        String message = "";

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            message = "It is a leapyear";
        else  
            message = "It is not a leapyear";

        System.out.println(message);
    }

}
