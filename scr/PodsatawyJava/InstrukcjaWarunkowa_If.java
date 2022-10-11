package PodsatawyJava;
// dwie liczby a i b.
// liczba, przez którą będziemy dzielić nie może być =0
// więc jeżlie dzielnik jest różny od zera to możemy operację wykonać

public class InstrukcjaWarunkowa_If {
    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 2.0F;

        if(dzielnik != 0)
// jeśli ten warunek jest spełniony, to wykonuje się kod w {}
// jeśłi nie jest spełniony, wówczas ta sekwencja kodu jest pomijana i wykonywana jest kolejna
        {
            System.out.println( "Wynik dzielenia: " + dzielna/dzielnik);
        }
        System.out.println("Proszę podaj inną liczbę");
    }
}
