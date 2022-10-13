package ObiektyJava.Persons;

//jest to klasa bazowa
// teraz będziemy tworzyli klasy, które będą dziedziczyły pola i metody
// to będą pola i metody współne ale też będą miały włąsne

public class Person {
    //pola klasy
    public String name;
    public int age;

    // metody
    public void eat() {
        System.out.println("I like pizza");
    }

    public void walk() {
        System.out.println("I like walking");
    }

    public void sayHello() {
        System.out.println("My name is " + name);
        System.out.println("I'm " + age);

    }
}
