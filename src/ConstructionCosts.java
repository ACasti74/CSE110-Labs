import java.util.Scanner;

/**
 * Author: Alejandro Castillo
 * FileName: ConstructionCosts.java
 * Specification: Program that compute the materials and costs required for a construction project.
 * For: CSE 110 - ConstructionCosts
 * Time Spent: 90 Minutes
 */

public class ConstructionCosts {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double lengthOfRoadInMiles;
        int numberOfLanes;
        int depthOfAsphaltInches;
        int daysToCompleteProject;

        System.out.println("Length of road (miles): ");
        lengthOfRoadInMiles = keyboard.nextDouble();

        System.out.println("Number of lanes: ");
        numberOfLanes = keyboard.nextInt();

        System.out.println("Depth of asphalt (inches): ");
        depthOfAsphaltInches = keyboard.nextInt();

        System.out.println("Days to complete project: ");
        daysToCompleteProject = keyboard.nextInt();

        double truckLoad = (Math.round(numberOfLanes * lengthOfRoadInMiles * 5280 * 12 * (double) depthOfAsphaltInches / 12 * 150) / 10000);
        int stopLights = 0;
        if (numberOfLanes == 1) {
            stopLights = (int) lengthOfRoadInMiles * 3;
        }
        if (numberOfLanes == 2) {
            stopLights = (int) lengthOfRoadInMiles * 4;
        }
        if (numberOfLanes == 3) {
            stopLights = (int) lengthOfRoadInMiles * 5;
        }
        int conduitPipes = (int) (lengthOfRoadInMiles * 5280) / 24;
        int crewMembersNeeded = (int) Math.round((50 * lengthOfRoadInMiles * numberOfLanes) / daysToCompleteProject);

        System.out.println("==== Amount of Material Needed ======");
        System.out.print("Truckload of Asphalt : " + truckLoad + "\n");
        System.out.print("Stoplights : " + stopLights + "\n");
        System.out.print("Conduit Pipes : " + conduitPipes + "\n");
        System.out.print("Crew members needed : " + crewMembersNeeded + "\n");

        int costOfAsphalt = (int) (truckLoad * 1000);
        int costOfStoplights = stopLights * 25000;
        int costOfConduitPipes = conduitPipes * 500;
        int costOfLabor = crewMembersNeeded * 25 * 8 * daysToCompleteProject;

        System.out.println("=== Cost of Materials ========");
        System.out.print("Cost of Asphalt : $ " + costOfAsphalt + "\n");
        System.out.print("Cost of Spotlights : $ " + costOfStoplights + "\n");
        System.out.print("Cost of Conduit pipes : $ " + costOfConduitPipes + "\n");
        System.out.print("cost of Labour : $ " + costOfLabor + "\n");

        int totalAmount = costOfAsphalt + costOfStoplights + costOfConduitPipes + costOfLabor;

        System.out.println("=== Total Amount ========");
        System.out.print("Total cost of Project : $ " + totalAmount);

    }
}