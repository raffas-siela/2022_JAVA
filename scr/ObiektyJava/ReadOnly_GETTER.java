package ObiektyJava;

public class ReadOnly_GETTER {
    //pole prywatne name
    private String name = "Bartek";

    // GETTER
    //jeśli chcemy aby inne klasy miały do tego dostęp
    //to możemy stworzyć metodę publiczną, która zwróci wartośc tego pola
    public String getName(){
        //return name;
        //możemy w tym miejscu modyfikowac to pole - bo jest to pole tylko do odczytu
        return name + "jest ok";
    }



}

// można to zrobić funkcją:
// kursor na pole privet
// alt + insert
// wyboeramy opcję: getter, setter, getter i setter