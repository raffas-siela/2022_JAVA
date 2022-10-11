package PodsatawyJava;

import java.util.Scanner;

public class OperatoryLogiczneUzycie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        boolean firstValue = firstNumber == secondNumber; //true
        boolean secondValue = firstNumber != secondNumber; //false
        boolean fourthValue = firstNumber < secondNumber; //false

        System.out.println(firstValue);
        System.out.println(secondValue);
        System.out.println(fourthValue);

        System.out.println("&&");
        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && fourthValue); //true


        System.out.println("||");
        System.out.println(firstValue || secondValue); //true


        System.out.println("!");
        System.out.println(!firstValue); // true; //false


    }
}
