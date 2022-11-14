package zadania;

/*Napisz program, który podaną jednocyfrową nieujemną liczbę całkowitą zapisze słownie. Przykład: jeżeli program otrzyma liczbę 2, powinien na konsoli wyświetlić “dwa”.
        Program powinien także: upewnić się, że liczba jest jednocyfrowa i nieujemna.
        Zakładamy, że liczba zawsze będzie całkowita.*/

import java.util.Scanner;

public class NumbersWriting2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę z przedziału od 1 do 5");
        int numberFromUser = scanner.nextInt();


        if(numberFromUser >= 1 && numberFromUser <= 5) {
            switch (numberFromUser){
                case 1:
                    System.out.println("jeden");
                    break;
                case 2:
                    System.out.println("dwa");
                    break;
                case 3:
                    System.out.println("trzy");
                    break;
                case 4:
                    System.out.println("cztery");
                    break;
                case 5:
                    System.out.println("pięć");
            }
        } else {
            System.out.println("podłeś nieprawidłową liczbę, spróbój jeszcze raz");
        }
    }
}
