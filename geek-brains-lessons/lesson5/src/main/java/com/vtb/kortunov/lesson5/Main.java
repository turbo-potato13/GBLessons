package com.vtb.kortunov.lesson5;

import com.vtb.kortunov.lesson5.task3.Apple;
import com.vtb.kortunov.lesson5.task3.Box;
import com.vtb.kortunov.lesson5.task3.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Task1:");

        Integer[] arrayInt = {1, 2, 3, 4};
        String[] arrayStr = {"AAA", "EEE", "HHH"};

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayStr));

        Swap<Integer> integerSwap = new Swap<>();
        Swap<String> stringSwap = new Swap<>();

        integerSwap.swapped(arrayInt, 0, 3);
        stringSwap.swapped(arrayStr, 1, 2);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayStr));
    }

    public static void task2() {
        System.out.println("Task2:");

        Transform<String> transform = new Transform<>();
        String[] strings = {"Raz", "Dva", "Tri"};
        ArrayList<String> arrayList = transform.toArrayList(strings);
        System.out.println(arrayList.toString());
    }

    public static void task3() {
        System.out.println("Task3:");

        Box<Apple> appleBox = new Box<>(new ArrayList<>());
        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        Box<Apple> appleBox1 = new Box<>(new ArrayList<>());
        appleBox.addFruit(new Apple(3f));
        appleBox.addFruit(new Apple(2f));
        appleBox.addFruit(new Apple(5f));

        orangeBox.addFruit(new Orange(4f));
        orangeBox.addFruit(new Orange(5f));
        orangeBox.addFruit(new Orange(3f));
        System.out.println(appleBox.compare(orangeBox));

        appleBox1.addFruit(new Apple(1f));
        appleBox1.addFruit(new Apple(1f));

        appleBox1.sprinkle(appleBox);
        System.out.println(appleBox.compare(orangeBox));
    }
}
