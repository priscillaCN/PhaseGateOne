import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = collectInput.nextLine();

        System.out.println("welcome " + name);
    }

}
