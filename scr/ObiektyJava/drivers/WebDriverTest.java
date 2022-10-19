package ObiektyJava.drivers;

import zadania.drivers.ChromeDriver;
import zadania.drivers.FirefoxDriver;
import zadania.drivers.WebDriver;

//modyfikacja WebDriverTest aby skorzystać z poliformizmu
//abyśmy nie musieli duplikować kodu
//chcemy uruchomić kod dla 2 przeglądarek

public class WebDriverTest {
    public static void main(String[] args) {

        //chcemy zedfiniować, że nasz Driver jest jakąś przeglądarką, czyli jest typu WebDriver
        //tworzymy metodę getDriver, która będzie pobierała drivera
        // w zależności od parametru zostanie zwrócony forefox lub chrome
        //nie mamy metody getDriver,
        // ale pomoc intelij, tworzymy automatycznie metodę jak podkresli się na czerwono jej brak
        WebDriver driver = getDriver("chrome");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

    }
//intelij utworzył metodę getDriver
    //musimy tylko uzupełnić String name zamiast Chrome
    private static WebDriver getDriver(String name) {
//dostarczamy implementację metody stworzonej przez intelij
        //równość stringów sprawdzamy przez name.equals("chrome")
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        return null;
    }
}

