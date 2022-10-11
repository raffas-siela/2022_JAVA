package PodsatawyJava;
// dwie liczby a i b.
// liczba, przez którą będziemy dzielić nie może być =0
// więc jeżlie dzielnik jest różny od zera to możemy operację wykonać
// w przeciwnym przypadku poprosić o podanie nowej liczby

public class InstrukcjaWarunkowa_If_else {
    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 0.0F;

        if(dzielnik != 0)
// jeśli ten warunek jest spełniony, to wykonuje się kod w {}
// jeśłi nie jest spełniony, wówczas ta sekwencja kodu jest pomijana i wykonywana jest kolejna po else
        {
            System.out.println( "Wynik dzielenia: " + dzielna/dzielnik);
        }
// to ta sekwencja jest wtykonywana, jeśłi warunek pierwszy nie jest spełniony
        else {
            System.out.println("Nie można dzielić przez ZERO. Podaj inną liczbę");
        }

    }
}
