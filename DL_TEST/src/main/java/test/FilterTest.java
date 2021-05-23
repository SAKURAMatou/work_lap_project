package src.main.java.test;

import src.main.java.person.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {
    public static void main(String[] args) {
        Person person = new Person();
        List<Person> personList = person.getPerssonList();
        List<String> names = personList.stream().filter(x -> x.getSalary() > 8000).map(Person::getName).collect(Collectors.toList());
        names.forEach(System.out::println);
        String name = personList.stream().max(Comparator.comparingInt(x -> x.getSalary())).map(Person::getName).get();
        System.out.println(name);
    }
}
