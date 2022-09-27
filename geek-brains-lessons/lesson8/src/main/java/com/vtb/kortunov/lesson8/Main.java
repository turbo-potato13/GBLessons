package com.vtb.kortunov.lesson8;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    //Task 1
    public static String getStringLongerFive(String str) {
        return Optional.ofNullable(str)
            .stream()
            .map(s -> s.split("\\s"))
            .flatMap(Stream::of)
            .filter(s -> s.length() > 5)
            .collect(Collectors.joining(" "));
    }

    //Task 2
    public static List<String> getListUniqueWord(String[][] strings) {
        return Optional.ofNullable(strings)
            .stream()
            .flatMap(Stream::of)
            .flatMap(Stream::of)
            .distinct()
            .collect(Collectors.toList());
    }

    //Task 3
    public static int getSumEvenNumbers() {
        return Stream.iterate(100, n -> n + 1)
            .limit(101)
            .filter(n -> n % 2 == 0)
            .reduce(0, Integer::sum);
    }

    //Task 4
    public static int getSumLength(String[] strings) {
        return Optional.ofNullable(strings)
            .stream()
            .flatMap(Stream::of)
            .map(String::length)
            .reduce(0, Integer::sum);
    }

    //Task 5
    public static List<String> getThreeWord(String[] strings) {
        return Optional.ofNullable(strings)
            .stream()
            .flatMap(Stream::of)
            .sorted()
            .limit(3)
            .collect(Collectors.toList());

    }

    public static void task1() {
        System.out.println("Task 1: ");
        System.out.println(getStringLongerFive(
            "We had 2 bags of grass, 75 pellets of mescaline, 5 sheets of high-powered blotter acid, a saltshaker half-full of cocaine, a whole galaxy of multi-colored uppers, downers, screamers, laughers... Also, a quart of tequila, a quart of rum, a case of beer, a pint of raw ether, and two dozen amyls. Not that we needed all that for the trip, but once you get locked into a serious drug collection, the tendency is to push it as far as you can. The only thing that really worried me was the ether. There is nothing in the world more helpless and irresponsible and depraved than a man in the depths of an ether binge, and I knew we'd get into that rotten stuff pretty soon."));
    }

    public static void task2() {
        System.out.println("Task 2: ");
        String[][] strings = {
            {"AAA", "BB", "AAA"},
            {"CCC", "BB", "BB"},
            {"GG", "BB", "CC"},
            {"PPP", "JJJ ", "A"}};
        System.out.println(getListUniqueWord(strings));
    }

    public static void task3() {
        System.out.println("Task 3: ");
        System.out.println(getSumEvenNumbers());
    }

    public static void task4() {
        System.out.println("Task 4: ");
        String[] str = {"sss", "ooo", "qq", "e", "BB", "AAA"};
        System.out.println(getSumLength(str));
    }

    public static void task5() {
        System.out.println("Task 5: ");
        String[] str = {"sss", "ooo", "qq", "e", "BB", "AAA"};
        System.out.println(getThreeWord(str));
    }
}
