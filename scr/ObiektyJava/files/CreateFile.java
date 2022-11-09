package ObiektyJava.files;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        //klasa File i tworymy obiekt tej klasy
        //podajemy nazwę pliku, który chchemy stworzyć/otworzyć
        File file = new File("test.txt");
        //aby stworzyć plik korzystamy z metody createNewFile
        //ta metoda zwraca wartość true/false
        //wartośc true zwróci jeśli plik nie istniał i utworzymy nowy
        //false jeśli plik istniał
        //metoda wyrzuca wyjtek - obsługujemy go
        if(file.createNewFile()) {
            System.out.println("create new file");
        } else {
            System.out.println("File is exist");
        }

    }
}
