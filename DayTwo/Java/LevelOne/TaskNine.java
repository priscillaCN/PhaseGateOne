import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter price of item: ");
        double price = collectInput.nextInt();

        double taxAmount = price * 0.01;

        System.out.println("The new price is: " + (price + taxAmount));
    }

}
