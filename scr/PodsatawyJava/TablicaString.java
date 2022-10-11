package PodsatawyJava;
// struktury pozwalajace gromadzić większą ilosc danych

public class TablicaString {
    public static void main(String[] args) {
        // String rodzaj danych
        // poprzez [] definiujemy typ danych tablica
        // imiona - nazwa tablicy
        // new String[3] - podajemy liczbę elementów nowej tablicy
        String[] imiona = new String[3];

        //dodawanie lementów tablicy
        //każdy element ma swój index, zaczynamy od zera
        imiona[0] = "Tom";
        imiona[1] = "Hot";
        imiona[2] = "Dog";

        // wypoisywanie elementów tablicy
        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);
    }
}
