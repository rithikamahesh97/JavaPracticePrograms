/**
 * Program Name: SwapNumbers
 * Description: Swaps two numbers entered by user.
 */

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("After Swapping:");
        System.out.println("First Number: " + number1);
        System.out.println("Second Number: " + number2);

        input.close();
    }
}