package ObiektyJava;

// METODA - blok kodu, który zawiera jakieś instrukcje
// metoda będzie wywoływana, gdy mamy jakiś obiekt danej klasy i odwołamy siędo tej metody korzystając z jej nazwy

public class PoliczWynik {
    //nie definiujemy żadnych pól
    //public - identyfikator dostepu
    //definijemy zwracany typ danych. może to być int, może to być String, może to też byćobiekt danej klasy, np. Sudent
    // jeśli nie chcemy nic zwracać używamy "void"
    //potem nazwa metody i nawiasy ();
    //i nawiasy klamrowe wewnątrz zawarte są instrukcje które będą wykonywane wewnątrz naszej metody

    public void  sumaCyfr() {
        System.out.println("zaraz policzę wynik");
        int result = 0;
        for (int i=0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Resultat to: " + result);
    }
}

// jak wywoałać metodę???
// musimy stworzyć obiekt tej klasy
// a następnie odwołać siędo naszej metody sumaCyfr za pomocą jej nazwy i nawiasów
// tworzymy nową klasę PoliczWynikTest
