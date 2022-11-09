package zadania.Company;


/*Napisz klasę Pracownik, która przechowuje trzy pola:

        Imię
        Nazwisko
        Wiek
        Następnie utwórz klasę Firma, w której wykorzystasz klasę pracownik do utworzenia dwóch obiektów przechowujących dane pracowników (wymyśl sobie jakieś)
        i później wyświetlasz je na ekran.*/

public class Pracownik {
    public String name;
    public String surName;
    public int age;

    public void infoWorker() {
        System.out.println("name: " + name);
        System.out.println("surname: " + surName);
        System.out.println("age: " + age);

    }
}


/*
class Pracownik {
    String imie;
    String nazwisko;
    int wiek;
}*/
