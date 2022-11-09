package ObiektyJava.Animals;

//KLASA ABSTRAKCYJNA - jest pewny uogólnieniem innych klas, nie ma swoich reprezentantów w postaci obiektów
// może zawierać metodę abstrakcyjną (metoda bez implementacji) trochęjak w interfejsie
// implementacj amusi zostać dostraczona w klasach któe dziedziczą po naszej metodzie
// klasa może zawierać stałe, oznaczone sttaic final, może też zawieraćzwykłe metody z ich implemenyacjami




public abstract class Animal {

    //tworzymy metodę abstrakcyjną
    //jej implementację dostarczą metody dziedziczące po klasie animal
    public abstract void sound();

    //wewnątrz klasy abstrakcyjnej możemy mieć stałe
    //zdefiniujemy pole, któe będzie miało stałą wartość
    public final static int legs = 4;

    //mmay też metodę, któa będzie miała implemtację
    public void sayHello() {
        System.out.println("Hello! I am an animal @ @ @ ");
    }
}
