package Controller;

import java.util.List;

import Model.Student;

public interface iGetModel {
    // Метод getAllStudents() предназначен для извлечения списка всех студентов.
    public List<Student> getAllStudents();

    // Метод deleteStudentById() выполняет удаление студента по указанному id из списка выгруженных
    public int deleteStudentById(Long id);
}