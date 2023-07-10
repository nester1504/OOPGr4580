package Domen;

public class Teacher extends Person {

    private String acadDegree;


    public Teacher(String name, int age, String acadDegree) {
        super(name, age);
        this.acadDegree = acadDegree;
    }
}
