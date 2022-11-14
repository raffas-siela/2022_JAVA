package zadania;

/*Napisz program, który podaną liczbę zamieni na tekst i go wyświetli zgodnie
        z poniższym wzorem:
        1 - Dzisiaj jest poniedziałek
        2 - Dzisiaj jest wtorek
        3 - Dzisiaj jest środa
        4 - Dzisiaj jest czwartek
        5 - Dzisiaj jest piątek
        6 - Dzisiaj jest weekend
        7 - Dzisiaj jest weekend
        Upewnij się też, że podana liczba jest z przedziału <1; 7>*/

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę z przedziału od 1 do 7");
        int numberFromUser = scanner.nextInt();

        if (numberFromUser >= 1 && numberFromUser <= 7) {
            String dayOfWeek = switch (numberFromUser){
                case 1 -> "poniedziałek";
                case 2 -> "wtorek";
                case 3 -> "środa";
                case 4 -> "czwartek";
                case 5 -> "piątek";
                case 6 -> "sobota";
                case 7 -> "niedziela";
                default -> "nie wiadomoco, ale nie moze się zdarzyć";
            };
            System.out.println("dzień tygodnia to: " + dayOfWeek);
        } else {
            System.out.println("podałeś nieprawidłową liczbę");
        }
    }
}
