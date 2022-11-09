package zadania.Company;

/*Napisz klasę Pracownik, która przechowuje trzy pola:

        Imię
        Nazwisko
        Wiek
        Następnie utwórz klasę Firma, w której wykorzystasz klasę pracownik do utworzenia dwóch obiektów przechowujących dane pracowników (wymyśl sobie jakieś)
        i później wyświetlasz je na ekran.*/


public class Firma {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik();
        pracownik1.name = "Hot";
        pracownik1.surName = "Dog";
        pracownik1.age = 45;

        Pracownik pracownik2 = new Pracownik();
        pracownik2.name = "Tom";
        pracownik2.surName = "Cat";
        pracownik2.age = 32;


        System.out.println("Pierwszy pracownik firmy: ");
        pracownik2.infoWorker();
        System.out.println("Drugi pracownik firmy: ");
        pracownik1.infoWorker();
    }
}

/*public class Firma{
    public static void main(String args[]){
        Pracownik pracownik1 = new Pracownik();
        Pracownik pracownik2 = new Pracownik();

        pracownik1.imie = "Staszek";
        pracownik1.nazwisko = "Ptaszek";
        pracownik1.wiek = 35;

        pracownik2.imie = "Wlodek";
        pracownik2.nazwisko = "Zieba";
        pracownik2.wiek = 45;

        System.out.println("Pracownicy firmy to:");
        System.out.println(pracownik1.imie+" "+pracownik1.nazwisko+", "+pracownik1.wiek+" lat");
        System.out.println(pracownik2.imie+" "+pracownik2.nazwisko+", "+pracownik2.wiek+" lat");
    }
}*/
