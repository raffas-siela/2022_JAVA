package ObiektyJava.drivers;

import zadania.drivers.WebDriver;

//modyfikacja WebDriverTest aby skorzystać z poliformizmu
//abyśmy nie musieli dupkować kodu

public class WebDriverTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        chromeDriver.get();
        chromeDriver.findElementBy();
        chromeDriver.findElementBy();
        chromeDriver.findElementBy();
        chromeDriver.findElementBy();
        chromeDriver.findElementBy();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();
        firefoxDriver.findElementBy();
        firefoxDriver.findElementBy();
        firefoxDriver.findElementBy();
        firefoxDriver.findElementBy();

    }
}
