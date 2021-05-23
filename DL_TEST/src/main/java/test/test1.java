package src.main.java.test;

import src.main.java.person.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class test1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(7, 6, 9, 3, 8, 2, 1);
        list.stream().filter(x -> x > 6).forEach(System.out::println);
        Optional<Integer> findFirst = list.stream().filter(x -> x > 6).findFirst();
        Optional<Integer> finfAny = list.stream().filter(x -> x > 6).findAny();
        //判断列表中是否有满足条件的元素，任何一个满足即可
        boolean anyMatch = list.stream().anyMatch(x -> x > 6);
        //判断列表元素是否全部满足条件
        boolean allmatch = list.stream().filter(x -> x > 6).allMatch(x -> x > 6);
        System.out.println("匹配：" + anyMatch);
        System.out.println("allmatch：" + allmatch);
        System.out.println("任意匹配：" + finfAny.get());
    }
}
