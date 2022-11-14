package zadania;

/*Napisz program, który podaną jednocyfrową nieujemną liczbę całkowitą zapisze słownie. Przykład: jeżeli program otrzyma liczbę 2, powinien na konsoli wyświetlić “dwa”.
        Program powinien także: upewnić się, że liczba jest jednocyfrowa i nieujemna.
        Zakładamy, że liczba zawsze będzie całkowita.*/

import java.util.Scanner;

public class NumbersWriting3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę z przedziału od 1 do 5");
        int numberFromUser = scanner.nextInt();

        if (numberFromUser >= 0 && numberFromUser <= 5) {
            String numberInWords = switch (numberFromUser) {
                case 0 -> "zero";
                case 1 -> "jeden";
                case 2 -> "dwa";
                case 3 -> "trzy";
                case 4 -> "cztery";
                case 5 -> "pięć";
                default -> "";
            };
            System.out.println("podana licba to: " + numberInWords);
        } else {
            System.out.println("podałeś złą liczbę");
        }
    }
}
