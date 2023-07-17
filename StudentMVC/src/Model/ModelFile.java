package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class ModelFile  implements iGetModel {
    private String fileName;

    public ModelFile(String fileName) {
        this.fileName = fileName;

        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students  = new ArrayList<Student>();
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], Integer.parseInt(param[1]), Integer.parseInt(param[2]));
                students.add(pers);
                line = reader.readLine();
            }

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        return students;
    }
    /**
     * Удаляет студента из модели на основе указанного идентификатора.
     *
     * @param id идентификатор студента для удаления
     * @return 1, если удаление выполнено успешно; 0, если студент с указанным идентификатором не найден
     */
    @Override
    public int deleteStudentById(Long id) {
        List<Student> students = getAllStudents();

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId() == id) {
                students.remove(i);
                saveAllStudentToFile(students);
                return 1;  // Удаление выполнено успешно
            }
        }

        return 0;  // Студент с указанным идентификатором не найден
    }



    public void saveAllStudentToFile(List<Student> students)
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers : students)
            {
                fw.write(pers.getName()+" "+pers.getAge()+" "+pers.getId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}