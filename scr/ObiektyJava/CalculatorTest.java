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

        int add = calculator.addition(firstNumber,secondNumber);
        int sub = calculator.subtration(firstNumber,secondNumber);
        int mul = calculator.multiplication(firstNumber,secondNumber);
        int div = calculator.division(firstNumber,secondNumber);
        int mod = calculator.modulo(firstNumber,secondNumber);

        System.out.println("dodawanie: " + add);
        System.out.println("odejmowanie: " + sub);
        System.out.println("mnożenie: " + mul);
        System.out.println("dzielenie: " + div);
        System.out.println("modulo: " + mod);
    }
}
