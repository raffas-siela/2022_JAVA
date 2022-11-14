package zadania;

/*Napisz program, który na podstawie boku kwadratu obliczy jego pole i obwód.
Pole i obwód powinny zostać wyświetlone na konsoli.
        Program powinien sprawdzić, czy wprowadzona długość boku jest dodatnia. Jeżeli jest, to powinien wykonać obliczenia i pokazać wynik.
        Jeżeli długość boku jest równa 0, powinien zostać wyświetlony komunikat “Długość boku nie może być równa 0”. Jeżeli
        długość boku jest ujemna, powinien zostać wyświetlony komunikat “Długość bokunie może być ujemna”.*/

import java.util.Scanner;

public class Kwadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj długość boku kwadratu");
        int bokKwadratu = scanner.nextInt();

        if (bokKwadratu > 0) {
            System.out.println("kwadrat o boku: " + bokKwadratu + " ma następujące wymiary");
            int obwódKwadratu = bokKwadratu * 4;
            System.out.println("obwód wynosi: " + obwódKwadratu);
            int poleKwadratu = bokKwadratu * bokKwadratu;
            System.out.println("pole wynosi: " + poleKwadratu);
        } else if (bokKwadratu == 0) {
            System.out.println("bok kwadratu nie może być zerem");
        } else
            {
            System.out.println("Długość boku nie może być ujemna");
        }
    }
}
