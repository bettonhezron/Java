package org.betthezron;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplication Table Generator");

        System.out.println("1. Single Table");
        System.out.println("2. Range of Tables");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        if (choice == 1){
            System.out.println("Enter the number: ");
            int number = scanner.nextInt();

            System.out.println("Enter the range (e.g., 10 for 1 to 10): ");
            int range = scanner.nextInt();

            System.out.println("Multiplication table for " + number);

            for (int i = 1; i <= range; i++){
                System.out.println(number + "x" + i + "=" + (number * i));
            }

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
