package zadania.drivers;

// stwórz interface WebDriver, który będzie miał 2 metody: get i findElementBy
// stwórz 2 klasy: ChromeDriver i FirefoxDriver, które będa implementowały ten interface
// get() chrome - wypisanie że otwieramy stronęza pomocą chroma
//get() firefox - otwieramy stronę za pomocą firefox
//findelementby chrome - znajdujemy elemnt za pomocą przeglądarki chrome
//findelementby firefox - znajdujemy elemnt za pomocą przeglądarki firefox


public interface WebDriver {
    void get();
    void findElementBy();
}
