package PodsatawyJava;
// zmienna - zarezerwowane miejsce w pamięci z określonym typem danych

public class Zmienne {
    public static void main(String[] args) {
// zmienna name i typ danych hString. od razu nie musimy deklarować jaie to będa dane. najwaznuejsze jest
// zadeklarowanie jakiego będą typu
// ale możemy przypisać wartośc poprzez znak '='
        String name = "Raf";
        System.out.println(name);

// deklarujemy zmienną firstNumber i przypisujemy wartość '1'
        int firstNumber = 1;
// deklarujemy drugą zmienną
        int secondNumber = 2;
// deklarujemy 3 zmienną
        int result = firstNumber + secondNumber;
        System.out.println(result);

// trzeba uważać, bo zmienne moga być nadpisane. jeśli teraz zadeklarujemy zmienną name i przypiszemy inną wartość,
// to ta wartość nadpisze poprzednią
        name = "Kasia";
        System.out.println(name);

//inicjalizowanie zmiennych i przypisywanie im wartości można zorbić inaczej
        int thirdNumber;
        int fourthNUmber;
        int resultSecond;
        fourthNUmber = 2;
        thirdNumber = 3;
        resultSecond = thirdNumber + fourthNUmber;
        System.out.println(resultSecond);

    }
}
