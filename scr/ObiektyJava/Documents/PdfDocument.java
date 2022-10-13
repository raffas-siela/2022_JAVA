package ObiektyJava.Documents;

// klasa pdfdocumnet rozszerza klasę bazową documnet
public class PdfDocument extends Document {
    //wewnątrz tej klasy nadpiszemy metodę getdescription
    public void getDescription(){
        System.out.println("Im pdf documnet");
    }
}
