package zadania.drivers;

import zadania.drivers.WebDriver;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("otwieramy stronę za pomocą firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("znajdujemy elemnt za pomocą przeglądarki firefox");
    }
}
