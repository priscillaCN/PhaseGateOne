import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = collectInput.nextInt();

        String message = "";

        if(score >= 50) 
            message = "Pass";

        else
            message = "Fail";

        System.out.println(message);
    }

}
