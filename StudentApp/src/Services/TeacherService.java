package Services;

import Domen.PersonComparator;
import Domen.Student;
import Domen.Teacher;

import java.util.List;

public class TeacherService implements iPersonService<Teacher> {

    private List<Teacher> teacher;
    String acadDegree;
    @Override
    public List<Teacher> getAll() {
        return null;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher per = new Teacher(firstName,age,acadDegree);
        teacher.add(per);
    }

    public void sortByFIOStdLst()
    {
        teacher.sort( new PersonComparator<Teacher>());
    }
}
