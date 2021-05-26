package src.main.java.test.streamlearn;

import src.main.java.person.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {
//        String[] strArr = { "abcd", "bcdd", "defde", "fTr" };
//        Arrays.stream(strArr).map(String::toUpperCase).forEach(System.out::println);
//        List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9, 11);
//        intList= intList.stream().map(x->x*10).collect(Collectors.toList());
//        System.out.println(intList.toString());
        Person person = new Person();
        List<Person> personList = person.getPerssonList();
        personList.stream().map(p -> {
            Person personNew = new Person(p.getName(), p.getSalary() + 100, p.getAge(), p.getSex(), p.getArea());
            return personNew.toString();
        }).forEach(System.out::println);

    }
}
