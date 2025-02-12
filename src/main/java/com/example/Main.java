package com.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 2nd number : ");
        int num2 = scanner.nextInt();

        Addition addition = new Addition();
        int result = addition.add(num1, num2);

        System.out.println("The result of addition is:      " + result);

        scanner.close();
    }
}
