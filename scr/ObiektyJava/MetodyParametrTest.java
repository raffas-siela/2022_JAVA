package ObiektyJava;

public class MetodyParametrTest {
    public static void main(String[] args) {
        MetodyParametr metodyParametr = new MetodyParametr();
        metodyParametr.policzWynikParam(2);
        metodyParametr.policzWynikParam(10);
        metodyParametr.policzWynikParam(100);
        metodyParametr.policzWynikParam(23);

        // tworzymy kalkulator
        // zakłądmay, że będziemy mieć metodę "add" dodawanie, ale nie jest nigdzie zdefiniowana
        // piszemy: "metodyParamert.add(2,3)"
        metodyParametr.add(2,3);
        // "add" mamy na czerwono - klikamy na czerwoną żarówkę i wybieramy opcję "create mathod add w MetodyPArametr"


    }
}
