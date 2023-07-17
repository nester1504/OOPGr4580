package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewRus implements iGetView {

    /**
     * Выводит список студентов.
     *
     * @param students список студентов для вывода
     */
    @Override
    public void printAllStudent(List<Student> students) {
        System.out.println("------список студентов--------");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }

    /**
     * Запрашивает у пользователя идентификатор студента для удаления.
     *
     * @return идентификатор студента для удаления в виде значения типа Long
     */
    @Override
    public Long getStudentIdToDelete() {
        System.out.print("Введите идентификатор студента для удаления: ");  // Запрашиваем у пользователя идентификатор студента для удаления
        Scanner scanner = new Scanner(System.in);
        long studentId = scanner.nextLong();
        scanner.nextLine();  // Считываем символ новой строки после ввода числа
        return studentId;
    }

    @Override
    public void displayStudents(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayStudents'");
    }

    @Override
    public Student readStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readStudent'");
    }

    @Override
    public Long getStudentIdToUpdate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToUpdate'");
    }

}