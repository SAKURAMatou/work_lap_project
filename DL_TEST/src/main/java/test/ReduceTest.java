package src.main.java.test;

import src.main.java.person.Person;

import java.util.List;
import java.util.Optional;

public class ReduceTest {
    public static void main(String[] args) {
        Person person = new Person();
        List<Person> personList = person.getPerssonList();
        Optional maxP = personList.stream().reduce((p1, p2) -> {
            return p1.getSalary() > p2.getSalary() ? p1 : p2;
        });
        System.out.println(maxP.get().toString());
    }
}
