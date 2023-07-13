package Services;

import Domen.Person;

import java.util.List;

public class AverageAge <T extends Person>{

    private List<T> persons;

    public AverageAge(List<T> persons) {
        this.persons = persons;
    }

    public double calculateAverageAge() {
        int sum = 0;
        for (T person : persons) {
            sum += person.getAge();
        }
        return (double) sum / persons.size();
    }

}
