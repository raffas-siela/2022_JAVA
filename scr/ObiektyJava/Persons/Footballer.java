package ObiektyJava.Persons;
// Footballer jest osobą, więc ma imię, ma wiek, je i spaceruje, ale ma też odrębną własnośc - gra w piłkę
// definiujemy też pole charaktetystyczne dla piłkarza Club

import ObiektyJava.Persons.Person;

public class Footballer extends Person {
    //dzięki extends Person mam ydostęp do pol i metod z klasy Person

    public String footballClub;

    public void playFootball() {
        System.out.println("I'm playing footbal in " + footballClub);
    }
    //nadpisanie metody eat z klasy Person
    public void eat() {
        System.out.println("I like healthy food !");
    }
}
