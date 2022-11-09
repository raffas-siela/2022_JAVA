package zadania;

public class Cars {
    String carName;
    int carYear;
    String carType;
    String carColour;

    public Cars(String carName, int carYear, String carType, String carColour) {
        this.carName = carName;
        this.carYear = carYear;
        this.carType = carType;
        this.carColour = carColour;

        System.out.println("name of car is: " + carName +
                ", year of car is: " + carYear +
                ", type of car is: " + carType +
                ", colour of car is: " + carColour);
    }

/*    void drive(){
        System.out.println("jedzie");
    }

    public void printCarName() {
        System.out.println("The car name is: " + carName);
    }
    public void printCarYear() {
        System.out.println("The car year is: " + carYear);
    }
    public void printCarType() {
        System.out.println("The car type is: " + carType);
    }
    public void printCarColour() {
        System.out.println("The car colour is: " + carColour);
    }*/
}
