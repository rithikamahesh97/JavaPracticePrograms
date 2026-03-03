import java.util.Scanner;

public class PracticePrograms {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        double sum = number1 + number2;

        System.out.println("Sum is: " + sum);

        input.close();
    }
}