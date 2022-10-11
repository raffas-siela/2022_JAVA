package PodsatawyJava;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();

        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber+secondNumber;
        int substraction = firstNumber-secondNumber;
        int multiplication = firstNumber*secondNumber;
        int division = firstNumber/secondNumber;
        int modulo = firstNumber%secondNumber;

        System.out.println("dodawanie: " + addition);
        System.out.println("odejmowanie: " + substraction);
        System.out.println("mnożenie: " + multiplication);
        System.out.println("dzielenie: " + division);
        System.out.println("modulo: " + modulo);

    }
}
