import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.ModelFile;
import Model.ModelHash;
import Model.Student;
import View.ViewEng;
import View.ViewRus;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Ser",  21, 101);
        Student s2 = new Student("Andr",  22, 111);
        Student s3 = new Student("Ivan", 22, 121);
        Student s4 = new Student("Igor", 23, 301);
        Student s5 = new Student("Dasha",  25, 171);
        Student s6 = new Student("Lena",  23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        // Создание хэшированного листа студентов и наполнение студентами
        HashMap<Long, Student> hashStudents = new HashMap<Long, Student>();
        hashStudents.put((long) 101, s1);
        hashStudents.put((long) 111, s2);
        hashStudents.put((long) 121, s3);
        hashStudents.put((long) 301, s4);
        hashStudents.put((long) 171, s5);
        hashStudents.put((long) 104, s6);

        ModelFile fModel = new ModelFile("StudentDB.txt");
        fModel.saveAllStudentToFile(students);

        iGetModel model = new ModelHash(hashStudents);

        // Запросить пользователя выбрать язык
        System.out.println("Выберите язык (1 - Русский, 2 - English): ");
        Scanner scanner = new Scanner(System.in);
        int languageChoice = scanner.nextInt();
        scanner.nextLine();

        // Создать объект для соответствующего выбранного языка
        iGetView languageView;
        switch (languageChoice) {
            case 1:
                languageView = new ViewRus();
                break;
            case 2:
                languageView = new ViewEng();
                break;
            default:
                System.out.println("Выбран неверный вариант языка. Используется английский язык по умолчанию.");
                languageView = new ViewEng();
                break;
        }

        Controller controlNew = new Controller(model, languageView);
        controlNew.run();
    }
}