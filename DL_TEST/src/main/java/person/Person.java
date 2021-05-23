package src.main.java.person;

import java.util.ArrayList;
import java.util.List;

public class Person {


    private String name;  // 姓名
    private int salary; // 薪资
    private int age; // 年龄
    private String sex; //性别
    private String area;  // 地区

    public Person() {
    }

    public Person(String name, int salary, int age, String sex, String area) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.sex = sex;
        this.area = area;
    }

    public List<Person> getPerssonList() {
        List<Person> arr = new ArrayList<>();
        arr.add(new Person("Tom", 8900, 20, "male", "New York"));
        arr.add(new Person("Lily", 7800, 20, "female", "Washington"));
        arr.add(new Person("Anni", 8200, 21, "female", "New York"));
        arr.add(new Person("Owen", 9500, 23, "male", "New York"));
        arr.add(new Person("Alisa", 7900, 22, "female", "New York"));
        return arr;
    }

    @Override
    public String toString() {
        return this.getName()+"-"+this.getSalary()+"-"+this.getSex();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
