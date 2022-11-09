package ObiektyJava.Animals;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Woof, woof");
        //możemy też skorzystać z metody sayHello
        //możemy też wypisać ilość nóg
        sayHello();
        System.out.println("I am an animal! number of legs: " + legs);
    }
}
