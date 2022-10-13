package ObiektyJava;

//stwórz 3 obiekty klasy Sudent
//przypisz wartości do pól
//stwórz tablicę i dodaj studentów do tablicy
//przejdź przez studentów w tablicy
//wywołaj wszytkie 4 metody

public class StudentAChecker {
    public static void main(String[] args) {

        String uczelnia = StudentA.nazwaUczelni;

        StudentA student1 = new StudentA();
        student1.imie = "Tom";
        student1.nazwisko = "Cat";
        student1.nick = "TomCat";
        student1.email = "tomacat@do.com";
        student1.nrIndeksu = 0000001;
        String uczelniaStudent1 = student1.nazwaUczelni;

        StudentA student2 = new StudentA();
        student2.imie = "Hot";
        student2.nazwisko = "Dog";
        student2.nick = "HotDog";
        student2.email = "hotgog@do.com";
        student2.nrIndeksu = 0000002;

        StudentA student3 = new StudentA();
        student3.imie = "Tony";
        student3.nazwisko = "Halik";
        student3.nick = "TonyHalik";
        student3.email = "tonyhalik@do.com";
        student3.nrIndeksu = 0000003;

        StudentA[] studenci = new StudentA[3];

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