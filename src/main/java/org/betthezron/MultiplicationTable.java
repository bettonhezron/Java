package org.betthezron;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit){

            System.out.println("\nMultiplication Table Generator");

            System.out.println("1. Single Table");
            System.out.println("2. Range of Tables");
            System.out.println("3. Save Tables to File.");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");

            int choice;

            try {
                choice = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Invalid Input.Please enter a number.");
                scanner.next();

                continue;
            }

            switch (choice){
                case 1:
                    generateSingleTable(scanner);
                    break;
                case 2:
                    generateRangeOfTables(scanner);
                    break;
                case 3:
                    saveTablesToFile(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting Multiplication Table Generator. GoodBye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();

        private static void generateSingleTable(Scanner scanner) {
            try {
                System.out.println("Enter the number:");
               int number = scanner.nextInt();

                System.out.println("Enter the range (e.g., 10 for 1 to 10): ");
                int range = scanner.nextInt();

                System.out.println("\nMultiplication table for " + number);

                for (int i = 1; i <= range; i++) {
                    System.out.println(number + "x" + i + "=" + (number * i));
                }
            }
        }

        if (choice == 1) {
            int number = 0;
            try {



            } catch (InputMismatchException e) {
                System.out.println("Invalid Input.Please enter a number.");
            }


            System.out.println("Enter the range (e.g., 10 for 1 to 10): ");
            int range = scanner.nextInt();



        } else if (choice == 2) {
            System.out.println("Enter the starting number: ");
            int start = scanner.nextInt();

            System.out.println("Enter the ending number: ");
            int end = scanner.nextInt();

            System.out.println("Enter the range (e.g., 10 for 1 to 10): ");
            int range = scanner.nextInt();

            for (int num = start; num < end; num++ ){
                System.out.println("\nMultiplication Table for " + num);

                for (int i = 1; i<= range; i++){
                    System.out.println(num + "x" + i + "=" + (num * i));
                }
            }

        } else {
            System.out.println("Invalid Choice.");
        }
        scanner.close();
    }


}
