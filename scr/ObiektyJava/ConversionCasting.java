package ObiektyJava;

//KONWERSJA I RZUTOWANIE TYPÓW

public class ConversionCasting {
    public static void main(String[] args) {
        //korzystamy z różnych typów danych i co trzeba zrobić, żeby było ok
        int a = 16;
        double b = 4.23;

        double c = a/b; //jest ok bo jest konwersja niejawna, in zostaje przekonwertowany na double
        // int d = a/b; - jest problem, oczekujemy inta, a otrzymujemy double. tu w przypadku konwersji utracimy dane
        //robimy konwersję jawną. jeśli nie ma znaczenia część po przecinku.
        // samodzielnie kowertujemy double na int, tracąc dokładność
        //przed zmienną, którą chcemy konwertować w () podajemy typ, na jki chcemy tę zmieną przekonwertować
        int d = a/(int) b;
        System.out.println(c);
        System.out.println(d);
    }
}
