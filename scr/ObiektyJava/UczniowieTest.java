package ObiektyJava;

public class UczniowieTest {
    public static void main(String[] args) {
        Uczniowie uczen1 = new Uczniowie();
        uczen1.imie = "tom";
        uczen1.nazwisko = "latek";
        uczen1.wiek = 12;

        uczen1.przedstawSie();
        uczen1.ileLat();
        uczen1.zajecie();

        Uczniowie uczen2 = new Uczniowie();
        uczen2.imie = "hot";
        uczen2.nazwisko = "dog";
        uczen2.wiek = 11;

        uczen2.przedstawSie();
        uczen2.ileLat();
        uczen2.zajecie();
    }
}
