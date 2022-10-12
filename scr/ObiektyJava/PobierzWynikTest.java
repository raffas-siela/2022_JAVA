package ObiektyJava;

public class PobierzWynikTest {
    public static void main(String[] args) {
        //nowy obiekt klasy w której zdefiniowaliśmy metody
        PobierzWynik pobierzWynik = new PobierzWynik();
        //odwołujemy się do zmiennej, która przechowuje ten obiekt
        pobierzWynik.liczeWynik();
        int result = pobierzWynik.liczeWynik();
        int result2 = result*result;
        System.out.println("wynik" + result);
        System.out.println(result2);
    }
}
