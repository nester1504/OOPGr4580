package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;
import java.util.Scanner;

public class ViewEng implements iGetView {

    /**
     * Выводит список студентов.
     *
     * @param students список студентов для вывода
     */
    @Override
    public void printAllStudent(List<Student> students) {
        System.out.println("------List of Students--------");
        for(Student student : students) {
            System.out.println(student);
        }
        System.out.println("===============================");
    }

    @Override
    /**
     * Запрашивает ввод пользователя и возвращает его введенные данные в виде строки.
     *
     * @param msg сообщение, которое будет отображено в качестве приглашения
     * @return введенные пользователем данные в виде строки
     */
    public String prompt(String msg) {
        System.out.print(msg + ": ");  // Выводим сообщение-приглашение
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();  // Считываем ввод пользователя
        return input;
    }

    /**
     * Запрашивает у пользователя идентификатор студента для удаления.
     *
     * @return идентификатор студента для удаления в виде значения типа Long
     */
    @Override
    public Long getStudentIdToDelete() {
        System.out.print("Enter the student ID to delete: ");  // Запрашиваем у пользователя идентификатор студента для удаления
        Scanner scanner = new Scanner(System.in);
        long studentId = scanner.nextLong();
        scanner.nextLine();  // Считываем символ новой строки после ввода числа
        return studentId;
    }

    @Override
    public void displayStudents(List<Student> students) {

    }

    @Override
    public Student readStudent() {
        return null;
    }

    @Override
    public Long getStudentIdToUpdate() {
        return null;
    }
}
