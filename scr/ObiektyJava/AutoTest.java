package ObiektyJava;

public class AutoTest {
    public static void main(String[] args) {
        //deklarujemy zmienną samochów, Auto to jest nazwa naszej klasy
        //nowy obiekt klasy Auto, który jest prypisany do zmiennej mercedes
        //jest oto typ obiektowy
        Auto samochod1 = new Auto();
        //teraz przypisujemy wartości do pól naszego obiektu
        //odwołujemy się do zmienej mercedes, która przechowuje nesz obiekt
        //czyli mercedes, po tym dajemy kropkę i mamy podpowiedź z polami zaznaczonymi na żółto
        //mają literę f, od pola (ang. field)
        //wybieramy konkretne pole, do którego chcemy przypisac wartośc
        samochod1.marka = "mercedes";
        samochod1.model = "klasa s";
        samochod1.rok = 2021;
        samochod1.przebieg = 1000;
        //zdefiniowaliśmy dla tego obeiktu wartości wszystkich pól

        //wywołujemy metody, które znajdują sięwewnątrz tej klasy
        //metody są oznaczone literą m
        samochod1.jedz();
        //aby sprawdzić co mamy w tej metodzie, przytrzymujemy ctrl i najeżdżamy kursorem na metodę
        //możemy też kliknąć i przeniesie nas do tej metody
        //ctrl+TAB wracamy
        samochod1.hamuj();
        samochod1.info();

        Auto samochod2 = new Auto();
        samochod2.marka = "Audi";
        samochod2.model = "A5";
        samochod2.rok = 2020;
        samochod2.przebieg = 100;

        samochod2.info();
        samochod2.jedz();
        samochod2.hamuj();
    }
}
