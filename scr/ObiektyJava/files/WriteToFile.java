package ObiektyJava.files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        //korzystamy z klasy FileWriter, zmienna writer, tworzymy nowy obiekt tej klasy, tworzymy ścieżkę
        FileWriter writer = new FileWriter("test.txt");
        writer.write("Some new text");
        writer.close();
    }
}
