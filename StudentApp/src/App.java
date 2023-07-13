import Controllers.EmploeeController;
import Domen.*;
import Services.AverageAge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        /**
         * Создание экземпляров студентов.
         */
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
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        listStud2.add(s12);


        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        StudentGroup group4581 = new StudentGroup(listStud2, 4581);

        List<StudentGroup> listSteam = new ArrayList<StudentGroup>();

        listSteam.add(group4580);
        listSteam.add(group4581);

//        StudentSteam studentSteam = new StudentSteam(123, listSteam);
//
//        for (StudentGroup studentGroup : studentSteam) {
//            System.out.println("Группа номер: " + studentGroup.getIdGroup());
//            for (Student std : studentGroup) {
//                System.out.println(std);
//            }
//        }

          System.out.println("=========================================================");


          for (Student std : group4580) {
              System.out.println(std);
          }

          System.out.println("=========================================================");
//
//          Collections.sort(group4580.getGroup());
//
//          System.out.println("=========================================================");
//
//          for (Student std : group4580.getGroup()) {
//              System.out.println(std);
//          }
//        System.out.println("=========================================================");
//
//
//        Collections.sort(studentSteam.getGroup());
//
//        for (StudentGroup studentGroup : studentSteam) {
//            System.out.println("Группа номер: " + studentGroup.getIdGroup());
//            for (Student std : studentGroup) {
//                System.out.println(std);
//            }
//        }

//        Student s1 = new Student("Иван", 25, 121);
//        Student s2 = new Student("Игорь", 23, 301);

//        PersonComparator<Student> comS = new PersonComparator<Student>();
//        comS.compare(s1, s2);

        /**
         * Создание экземпляров учетелей.
         */

        Teacher t1 = new Teacher("Иван", 45, "Доцент");
        Teacher t2 = new Teacher("Артём", 39, "Профессор");
        Teacher t3 = new Teacher("Марина", 55, "Профессор");
        Teacher t4 = new Teacher("Николай", 98, "Кандидат наук");
        Teacher t5 = new Teacher("Алла", 47, "Доцент");
        Teacher t6 = new Teacher("Екатерина", 63, "Доцент");

//        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
//        comT.compare(t1, t2);

//        comS.compare(s1, t2);
//        PersonComparator<Person> comP = new PersonComparator<Person>();
//        comP.compare(s1, t2);

//        Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
//        EmploeeController empControll = new EmploeeController();
//        EmploeeController.paySalary(e1);
//         EmploeeController.paySalary(s1);
//        empControll.paySalary(e1);
//        empControll.paySalary(s1);

        /**
         * Создание экземпляров сотрудников.
         */
        Emploee e1 = new Emploee("Иван", 34, "Охранник");
        Emploee e2 = new Emploee("Оксана", 64, "Повар");
        Emploee e3 = new Emploee("Александр", 37, "Директор");
        Emploee e4 = new Emploee("Алина", 29,"Бухгалтер");


        List<Teacher> listTeacher = new ArrayList<>();
        listTeacher.add(t1);
        listTeacher.add(t2);
        listTeacher.add(t3);
        listTeacher.add(t4);
        listTeacher.add(t5);

        List<Emploee> listEmloyee = new ArrayList<>();
        listEmloyee.add(e1);
        listEmloyee.add(e2);
        listEmloyee.add(e3);
        listEmloyee.add(e4);

        for (Teacher th : listTeacher) {
            System.out.println(th);
        }

        System.out.println("=========================================================");

        for (Emploee em : listEmloyee) {
            System.out.println(em);
        }

        System.out.println("=========================================================");



        AverageAge<Student> averageAgeOfStudents = new AverageAge<>(listStud);
        System.out.println("Средний возраст студентов: " + averageAgeOfStudents.calculateAverageAge());
        AverageAge<Teacher> averageAgeOfTeachers = new AverageAge<>(listTeacher);
        System.out.println("Средний возраст преподавателей: " + averageAgeOfTeachers.calculateAverageAge());
        AverageAge<Emploee> averageAgeOfEmploee = new AverageAge<>(listEmloyee);
        System.out.println("Средний возраст работников: " + averageAgeOfEmploee.calculateAverageAge());

    }


}
