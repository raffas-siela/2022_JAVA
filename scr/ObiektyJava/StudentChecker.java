package ObiektyJava;

//stwórz 3 obiekty klasy Sudent
//przypisz wartości do pól
//stwórz tablicę i dodaj studentów do tablicy
//przejdź przez studentów w tablicy
//wywołaj wszytkie 4 metody

public class StudentChecker {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.imie = "Tom";
        student1.nazwisko = "Cat";
        student1.nick = "TomCat";
        student1.email = "tomacat@do.com";
        student1.nrIndeksu = 0000001;

        Student student2 = new Student();
        student2.imie = "Hot";
        student2.nazwisko = "Dog";
        student2.nick = "HotDog";
        student2.email = "hotgog@do.com";
        student2.nrIndeksu = 0000002;

        Student student3 = new Student();
        student3.imie = "Tony";
        student3.nazwisko = "Halik";
        student3.nick = "TonyHalik";
        student3.email = "tonyhalik@do.com";
        student3.nrIndeksu = 0000003;

        Student[] studenci = new Student[3];

        studenci[0] = student1;
        studenci[1] = student2;
        studenci[2] = student3;

        System.out.println(studenci[0]);
        System.out.println(studenci[1]);
        System.out.println(studenci[2]);

        for (int i = 0; i < studenci.length; i++) {
            studenci[i].przedstawSie();
            studenci[i].podajEmail();
            studenci[i].podajNrIndeksu();
            studenci[i].zalogujSie();
        }
    }
}