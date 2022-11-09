package zadania;

/*Napisz prosty kalkulator, w którym stworzysz 3 zmienne typu double o nazwach a, b, c. Do każdej z nich przypisz dowolną wartość. Wypróbuj wszystkie operatory matematyczne obliczając wynik działań:

        (a + b) * c
        a - b / c
        Następnie użyj operatorów inkrementacji i zwiększ wszystkie zmienne o 1.

        Teraz wyświetl wynik następujących zdań logicznych:

        czy (a + b) > c?
        czy a jest równe b?
        Przedstaw wyniki w konsoli.

        Rozwiązanie znajdziesz poniżej.*/


public class OperatoryMatematyczne {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 4;

        double d = (a + b) * c;
        double e = a - b / c;
        System.out.println("(a + b) * c = " + d);
        System.out.println("a - b / c = " + e);

        System.out.println(++a);
        System.out.println(++b);
        System.out.println(++c);

        boolean resultFirst = (a + b) > c;
        System.out.println(resultFirst);

        boolean resultSecond = a == b;
        System.out.println(resultSecond);
        }
    }

class MathOperations {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        System.out.println("(a + b) * c = " + ((a + b) * c));
        System.out.println("a - b / c = " + (a - b / c));

        a++;
        b++;
        c++;

        System.out.println("Czy a + b > c? " + ((a + b) > c));
        System.out.println("Czy a = b? " + (a == b));
    }
}