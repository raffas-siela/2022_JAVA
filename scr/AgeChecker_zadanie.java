
//poproś użytkownika o rok urodzenia
//jesli jest pełnoletni zaproś na zakupy alkocholu
//jeśłi nie jest pełniletni podziękuj zazakupy

import java.util.Scanner;

public class AgeChecker_zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok urodzenia");
        int year = scanner.nextInt();
        int age = 2022 - year;
        System.out.println("Masz lat: " + age);

        if (age>=18) {
            System.out.println("Zapraszamy na zakupy ! ! !   ;-) ");
        } else {
            System.out.println("Jesteś niepełnoletni, spadaj !!!!! :-( ");
        }
    }
}
