package Controllers;

import Domen.Teacher;
import Services.StudentService;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher>{

    private final TeacherService dataService = new TeacherService();
    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName,age);
        dataService.sortByFIOStdLst();
    }
}
