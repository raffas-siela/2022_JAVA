package ObiektyJava.Persons;

public class PersonTest {
    //tworzymy metode wykonywalną main
    public static void main(String[] args) {
        //tworzymy obiekt klasy MathTeacher
        MathTeacher teacher = new MathTeacher();
        teacher.name = "Tom";
        teacher.age = 29;
        teacher.school = "gimnazjum";

        teacher.sayHello();
        teacher.walk();
        teacher.eat();
        teacher.teachMath();

        //tworzymy obiekt klasy Footballer
        Footballer footballer = new Footballer();
        footballer.name = "Greg";
        footballer.age = 18;
        footballer.footballClub = "Tęcza Korzen";

        footballer.sayHello();
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}
