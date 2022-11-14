package zadania;

/*Napisz program, który podaną jednocyfrową nieujemną liczbę całkowitą zapisze słownie. Przykład: jeżeli program otrzyma liczbę 2, powinien na konsoli wyświetlić “dwa”.
        Program powinien także: upewnić się, że liczba jest jednocyfrowa i nieujemna.
        Zakładamy, że liczba zawsze będzie całkowita.*/

import java.util.Scanner;

public class NumbersWriting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą od 0 do 5");
        int numberFromUser = scanner.nextInt();

        if (numberFromUser == 0) {
            System.out.println("zero");
        } else if (numberFromUser == 1) {
            System.out.println("jeden");
        } else if (numberFromUser == 2) {
            System.out.println("dwa");
        } else if (numberFromUser == 3) {
            System.out.println("trzy");
        } else if (numberFromUser == 4) {
            System.out.println("cztery");
        } else if (numberFromUser == 5) {
            System.out.println("pięć");
        } else {
            System.out.println("podałeś nieprawidłową liczbę");
        }
    }
}
