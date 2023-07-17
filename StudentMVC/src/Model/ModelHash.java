package Model;

import Controller.iGetModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModelHash implements iGetModel {

    private HashMap<Long, Student> students;


    /**
     * Конструктор класса ModelHash.
     *
     * @param students Список студентов в виде хэш-таблицы
     */
    public ModelHash(HashMap<Long, Student> students) {
        this.students = students;
    }

    /**
     * Возвращает список всех студентов.
     *
     * @return Список студентов
     */
    public List<Student> getAllStudents() {
        List<Student> studList = new ArrayList<Student>();

        for (var stud : students.entrySet())
            studList.add(stud.getValue());

        return studList;
    }

    /**
     * Удаляет студента по заданному идентификатору.
     *
     * @param id Идентификатор студента для удаления
     * @return 1 = если студент успешно удален, -1 = если студент с указанным идентификатором не найден
     */
    public int deleteStudentById(Long id) {
        if (students.containsKey(id)) {
            students.remove(id);
            return 1;
        }
        return -1;
    }
}
