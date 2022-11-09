package zadania;

import static java.lang.Math.*;

/*Napisz prosty kalkulator, w którym zainicjujesz dwie zmienne int o nazwach a i b dowolnymi liczbami mieszczącymi się w zakresie - niech a będzie liczbą ujemną, natomiast b dodatnią.
        Następnie wykorzystując import statyczny wyświetl wyniki następujących działań bez użycia dodatkowych zmiennych:
        - a^b (a do potęgi b)
        - |a| (wartość bezwzględna z liczby a)
        - pierwiastek z liczby a podniesionej do potęgi b.
        Zobacz co się stanie, gdy do a i b przypiszesz dwie 3 cyfrowe liczby, oraz gdy liczba b będzie nieparzysta (wynik a^b będzie ujemny).*/


public class Math {

        public static void main(String[] args){
            int a = -125;
            int b = 3;
            System.out.println(pow(a, b));
            System.out.println(abs(a));
            System.out.println(sqrt(pow(a,b)));
        }
    }

