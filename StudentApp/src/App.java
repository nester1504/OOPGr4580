import Domen.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 53, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 43, 444);
        Student s5 = new Student("Даша", 21, 171);
        Student s6 = new Student("Лена", 50, 104);

        Student s7 = new Student("Коля", 20, 221);
        Student s8 = new Student("Света", 45, 371);
        Student s9 = new Student("Рома", 22, 191);
        Student s10 = new Student("Анна", 21, 474);
        Student s11 = new Student("Герман", 20, 677);
        Student s12 = new Student("Лена", 33, 184);


        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        List<Student> listStud2 = new ArrayList<Student>();
        //listStud2.add(s7);
        //listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        listStud2.add(s12);


        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        StudentGroup group4581 = new StudentGroup(listStud2, 4581);

        List<StudentGroup> listSteam = new ArrayList<StudentGroup>();

        listSteam.add(group4580);
        listSteam.add(group4581);

        StudentSteam studentSteam = new StudentSteam(123, listSteam);

        for (StudentGroup studentGroup : studentSteam) {
            System.out.println("Группа номер: " + studentGroup.getIdGroup());
            for (Student std : studentGroup) {
                System.out.println(std);
            }
        }

        //  System.out.println("=========================================================");


        //  for (Student std : group4580) {
        //      System.out.println(std);
        //  }

        //  System.out.println("=========================================================");

        //  Collections.sort(group4580.getGroup());

        //  System.out.println("=========================================================");

        //  for (Student std : group4580.getGroup()) {
        //      System.out.println(std);
        //  }
        System.out.println("=========================================================");


        Collections.sort(studentSteam.getGroup());

        for (StudentGroup studentGroup : studentSteam) {
            System.out.println("Группа номер: " + studentGroup.getIdGroup());
            for (Student std : studentGroup) {
                System.out.println(std);
            }
        }

    }


}
