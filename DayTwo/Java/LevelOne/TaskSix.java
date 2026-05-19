import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        int length = collectInput.nextInt();

        System.out.println("Enter width of rectangle: ");
        int width = collectInput.nextInt();

        int area = length * width

        System.out.println("The area is: " + area);
    }

}
