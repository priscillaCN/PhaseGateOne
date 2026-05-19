import java.util.Scanner;

public class TaskSeven {

    public static void main(String[] args) {

        float pi = 3.14f;

        Scanner collectInput = new Scanner(System.in);

        System.out.println("Enter radius of circle: ");
        float radius = collectInput.nextInt();

        float circumference = 2 * pi * radius

        System.out.println("The circumference is: " + circumference);
    }

}
