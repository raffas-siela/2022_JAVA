package ObiektyJava;

//chcemy zwrócić wynik, który będzie int

public class PobierzWynik {
    public int liczeWynik() {
        System.out.println("zaraz pobiorę wynik");
        int result = 0;
        for (int i=0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Resultat to: " + result);
        //na końcu naszej metody podajemy wartość, którą chcemy zwrócić
        // i ma to być int, zadeklarowany na pcozątku
        return result;
    }
}
