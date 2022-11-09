package zadania;
/*Napisz program, w którym zadeklarujesz kilka zmiennych finalnych, lub zmiennych różnych typów o dowolnych nazwach, a następnie wyświetlisz je w kolejnych wierszach.

        W tym samym programie zadeklaruj cztery zmienne typu String. Trzy z nich zainicjuj jakimiś wyrazami, a czwartemu przypisz ciąg znaków utworzony z połączenia trzech wcześniejszych zmiennych. Następnie wyświetl czwartą zmienną na ekranie.

        Przy użyciu metody substring wyświetl na ekranie dwa pierwsze wyrazy wykorzystując odwołując się wyłącznie do czwartej zmiennej typu String.*/

public class DefiniowanieZmiennych {
    public static void main(String[] args) {
        short a = 5;
        final int b = 129;
        final char c = 'c';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String x = "Ala ";
        String y = "ma ";
        String z = "kota";
        String zdanie = x + y + z;

        System.out.println(zdanie);
        System.out.println(zdanie.substring(0, 7));
    }
}
