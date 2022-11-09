package ObiektyJava;

public class ExceptionsExample {
    public static void main(String[] args) {
        //deklarujemy tablicę numbers długośc 2 elementy
        int[] numbers = new int[2];
        //odwołujemy się do elementów
        numbers[0] = 1;
        numbers[1] = 3;

        //teraz za pomoca petli for chcemy przejśc po wszystkich elementach i wypisać je na ekranie
        for (int i=0; i<= numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
