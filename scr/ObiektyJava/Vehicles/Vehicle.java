package ObiektyJava.Vehicles;

//interface - zestaw metod bez ich implementacji
// czyli będziemy określali zwracany typ, nawę metody ale bez ciała metody czyli bez kodu
// ciało metody zostanie dostarczone przez klasy, które będą implementował ynasz interface

public interface Vehicle {
    void go (int speed);
    void stop ();
    String info();
}
