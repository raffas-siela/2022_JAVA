package zadania.drivers;

public class WebDriverTest {
    public static void main(String[] args) {
        //tworzymy obekjty dwóch klas
        ChromeDriver chromeDriver = new ChromeDriver();
        FirefoxDriver firefoxDriver = new FirefoxDriver();

        //wywołujemy te metody:
        chromeDriver.get();
        chromeDriver.findElementBy();
        firefoxDriver.get();
        firefoxDriver.findElementBy();
    }
}
