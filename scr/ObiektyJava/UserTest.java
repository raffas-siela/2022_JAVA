package ObiektyJava;

public class UserTest {
    public static void main(String[] args) {
        //tworzymy nowy obiekt klasy User
        User user = new User();

        //przypisujemy mu wartośc username
        user.username = "Tom";
        user.password = "QWERTY";

        //skorzystamy też z metody, która wypisze podaną wczesniej wartośc
        user.sayHello();


    }
}
