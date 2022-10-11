package zadania;

//wypisz liczby od 1 do 100 podzielne przez 3

public class Loop_zadanie2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("jestem podzielna przez 3: " + i);
            }
        }
    }
}