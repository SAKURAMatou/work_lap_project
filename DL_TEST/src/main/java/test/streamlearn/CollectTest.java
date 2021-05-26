package src.main.java.test.streamlearn;

import src.main.java.person.Person;

import java.util.List;
import java.util.stream.Collectors;

public class CollectTest {
    public static void main(String[] args) {
        Person person = new Person();
        List<Person> personList = person.getPerssonList();
        Long count = personList.stream().collect(Collectors.counting());
        System.out.println("总数：" + count);
        double avgSalary = personList.stream().collect(Collectors.averagingDouble(p -> p.getSalary()));
        System.out.println("平均工资：" + avgSalary);
    }
}
