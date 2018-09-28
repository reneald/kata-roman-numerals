package be.reneald.kata.romannumerals;

import java.util.Scanner;

public class Main {
    private static final Integer TO_ROMAN = 1;
    private static final Integer TO_DECIMAL = 2;
    private static final Integer MAXIMUM = 3000;
    private static final Converter converter = new Converter();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to this Roman numeral converter.");
        System.out.println("Would you like to convert from decimal to Roman or the other way around?");
        System.out.println("[" + TO_ROMAN + "] from decimal to Roman");
        System.out.println("[" + TO_DECIMAL + "] from Roman to Decimal");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == TO_ROMAN) {
            convertToRomanNumerals(scanner);
        } else {
            convertToDecimals(scanner);
        }
        scanner.close();
    }

    private static void convertToDecimals(Scanner scanner) {
        System.out.println("This doesn't work yet! If you want to convert from decimal to Roman, type " +
                TO_ROMAN + " and hit <Enter>.");
        continueOrNot(scanner);
    }

    private static void convertToRomanNumerals(Scanner scanner) {
        System.out.println("Please type a number (lower than " +
        MAXIMUM + ") and I'll convert it to a Roman numeral for you.");
        System.out.println(converter.toRoman(Integer.parseInt(scanner.nextLine())));
        System.out.println("If you want to try again, type " +
                TO_ROMAN + " and hit <Enter>.");

        continueOrNot(scanner);
    }

    private static void continueOrNot(Scanner scanner) {
        if (TO_ROMAN.toString().equals(scanner.nextLine())) {
            convertToRomanNumerals(scanner);
        } else {
            System.out.println("Goodbye!");
        }
    }
}
