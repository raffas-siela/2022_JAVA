package zadania;

import java.util.Scanner;

// poproś użytkownika o podanie 2 liczb
// zastosuj do nich operatory porównania

public class OperatoryPorównania_zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + " > " + secondNumber + " wynik: " + (firstNumber > secondNumber));
        System.out.println(firstNumber + " < " + secondNumber + " wynik: " + (firstNumber < secondNumber));
        System.out.println(firstNumber + " >= " + secondNumber + " wynik: " + (firstNumber >= secondNumber));
        System.out.println(firstNumber + " >= " + secondNumber + " wynik: " + (firstNumber <= secondNumber));
        System.out.println(firstNumber + " = " + secondNumber + " wynik: " + (firstNumber == secondNumber));
        System.out.println(firstNumber + " =/= " + secondNumber + " wynik: " + (firstNumber != secondNumber));

    }
}
