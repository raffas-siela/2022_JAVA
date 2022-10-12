package ObiektyJava;

//napisz program który poprosi użyutkownika o 2 liczby
// nastepnie wykona na nich podstawowe operacje matematyczne

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        calculator.addition(firstNumber,secondNumber);
        calculator.subtration(firstNumber,secondNumber);
        calculator.multiplication(firstNumber,secondNumber);
        calculator.division(firstNumber,secondNumber);
        calculator.modulo(firstNumber,secondNumber);
    }
}
