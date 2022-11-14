package zadania;

/*Napisz program, który sprawdzi czy podana liczba całkowita jest mniejsza od zera. Jeżeli liczba jest mniejsza od zera,
        wyświetl na konsoli komunikat “Podana liczba jest mniejsza od zera”.
        Jeżeli liczba będzie większa lub równa zero, wyświetl komunikat “Podana liczba jest większa lub równa zero”.*/

import java.util.Scanner;

public class NumbersChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int numberFirst = scanner.nextInt();

        if (numberFirst < 0) {
            System.out.println("Podana liczba jest mniejsza od zera");
        } else {
            System.out.println("Podana liczba jest większa lub równa zero");
        }
    }
}
