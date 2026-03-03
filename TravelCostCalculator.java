/**
 * Program Name: TravelCostCalculator
 * Description: Calculates total and per-person travel cost.
 */

import java.util.Scanner;

public class TravelCostCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double distance = input.nextDouble();

        System.out.print("Enter cost per km: ");
        double costPerKm = input.nextDouble();

        System.out.print("Enter number of passengers: ");
        int passengers = input.nextInt();

        double totalCost = distance * costPerKm;
        double costPerPerson = totalCost / passengers;

        System.out.println("Total Travel Cost: " + totalCost);
        System.out.println("Cost Per Passenger: " + costPerPerson);

        input.close();
    }
}