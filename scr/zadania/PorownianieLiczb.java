package zadania;

/*Pobierz w konsoli dwie liczby całkowite, następnie porównaj je i wyświetl stosowny komunikat z wynikiem.*/

import java.util.Scanner;

public class PorownianieLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();

        System.out.println("podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        boolean wynikPor = firstNumber == secondNumber;
        System.out.println("liczby są równe: " + wynikPor);

        boolean wynikWieksza = firstNumber > secondNumber;
        System.out.println("pierwsza liczba jest większa od drugiej: " + wynikWieksza);

        boolean wynikMniejsza = firstNumber < secondNumber;
        System.out.println("pierwsza liczba jest mniejsza od drugiej: " + wynikMniejsza);

    }
}


class Odczyt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę: ");
        int a = scanner.nextInt();
        System.out.println("Podaj 2 liczbę: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Podane liczby są równe");
        }
        else if (a > b) {
            System.out.println("Pierwsza liczba jest większa");
        }
        else {
            System.out.println("Druga liczba jest większa");
        }
    }
}


