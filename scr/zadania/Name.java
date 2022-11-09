package zadania;

/*Napisz program, który pobierze od użytkownika imię i przechowa je w zmiennej. Następnie stwórz kilka warunków z różnymi imionami.
        Jeśli któreś z imion będzie pasowało wyświetl "Cześć jakieś_imię", gdy program nie znajdzie imienia wyświetl "Przykro mi, ale Cię nie znam".*/

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj mi jakieś imię");
        String nameFirst = scanner.nextLine();

        if ("Tom".equals(nameFirst)) {
            System.out.println("cześć " + nameFirst);
        } else if ("Jerry".equals(nameFirst)) {
            System.out.println("Chodźmy na piwko " + nameFirst);
        } else {
            System.out.println("nie znamy się");
        }




    }
}
