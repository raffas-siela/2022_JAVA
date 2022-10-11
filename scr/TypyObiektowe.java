
//przechowują aktualnawartość oraz umowżliwiają wykonanie akcji (wywoałanie metod) na tych danych

public class TypyObiektowe {
    public static void main(String[] args) {

        //liczby stałoprzecinkowe
        Byte firstNumber = 127; // -127 do 127
        Short secondNumber = 32689; //-32689 do 32767
        Integer thirdNumber = 32768999;
        Long fourthNumber = 2148000L;

        // liczby zmiennoprzecinkowe
        Float fifthNumber = 4.999934F;
        Double sixthNumber = 3.99999999999999999D;

        // wartośc logiczna
        Boolean prawda = true;
        Boolean fałsz = false;

        // pojedynczy znak
        Character letter = 'A';

        //ciągi znaków
        String hello = "Hello Raf";

// pokaże literę, która ma indeks '0', czyli jest pierwsza w naszym ciąg uznaków
        System.out.println(hello.charAt(0));


    }
}
