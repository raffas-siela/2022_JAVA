package ObiektyJava;

// KONSTRUKTORY - spejalne metody zwracajace obiekt danej klasy
// które są tworozne automatycznie podczas tworzenia obiektu

public class User {
    // tworzymy dwa pola publiczne typu String
    public String username;
    public String password;
// w tej klasie nie widzimy jakiejś specjalnej metody. jest w java konstruktor domyślny, którego nie treba jawnie definiować
// wygląda tak: jest to metoda publiczna i której zwracanym typem jest obiekt danej klasy
    public User() {
        System.out.println("hello z konstruktora");
    }

    //tworzymy metodę, która nic nie zwraca, też publiczna
    public void sayHello() {
        System.out.println("Hello, my name is " + username);
    }



}
