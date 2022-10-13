package ObiektyJava;

public class ReadOnly_SETTER {

    //SETTER
    // jest to metpoda, która umożliwia przupisać wartość pola, które jest prywatne
    //METODA NIC NIE ZWRACA, TYLKO PRZYPISUJE WARTOŚC

    private String name = "Bartek";

    //metoda przyjmuje parametr: String, który jest przypisany do pola: name
    public void setName(String name) {
        this.name = name;

    }
}

// można to zrobić funkcją:
// kursor na pole privet
// alt + insert
// wyboeramy opcję: getter, setter, getter i setter