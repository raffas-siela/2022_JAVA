package ObiektyJava.Persons;

import ObiektyJava.Persons.Person;

public class MathTeacher extends Person {
    //dzięki extends Person mam ydostęp do pol i metod z klasy Person

    public String school;

    public void teachMath(){
        System.out.println("I'm teachig math in " + school);
    }
    public void walk(){
        System.out.println("I love running");
    }

    }
