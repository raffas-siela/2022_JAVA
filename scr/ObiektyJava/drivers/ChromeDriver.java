package ObiektyJava.drivers;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("otwieramy stronę za pomocą chroma");
    }

    @Override
    public void findElementBy() {
        System.out.println("znajdujemy elemnt za pomocą przeglądarki chrome");
    }
}
