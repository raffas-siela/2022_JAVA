package zadania;

/*Napisz program, który z trzech wprowadzonych liczb wybierze największą i wyświetli ją w konsoli.
        Zakładamy, że wszystkie trzy liczby są różne od siebie.*/

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę");
        int numberFirst = scanner.nextInt();
        System.out.println("podaj drugą liczbę");
        int numberSecond = scanner.nextInt();
        System.out.println("podaj trzecią liczbę");
        int numberThird = scanner.nextInt();

        if (numberFirst > numberSecond && numberFirst > numberThird) {
            System.out.println("największa liczba to: " + numberFirst);
        } else if (numberSecond > numberFirst && numberSecond >numberThird) {
            System.out.println("największa liczba to: " + numberSecond);
        } else if (numberThird > numberFirst && numberThird > numberSecond)
        {
            System.out.println("największa liczba to: " + numberThird);
        } else {
            System.out.println("podałeś złe liczby. spróbój jeszcze raz ;-)");
        }
    }
}
