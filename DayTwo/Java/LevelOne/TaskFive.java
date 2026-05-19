import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter temperature in celsius: ");
        int tempInCelsius = collectInput.nextInt();

        int tempInFarenheit = (tempInCelsius * 9 / 5) + 32

        System.out.println("The temperature in Farenheit is: " + tempInFerenheit);
    }

}
