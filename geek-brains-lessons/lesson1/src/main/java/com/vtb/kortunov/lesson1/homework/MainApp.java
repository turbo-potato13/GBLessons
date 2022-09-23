package com.vtb.kortunov.lesson1.homework;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
    }

    //Task 1
    public static boolean sumRangeFrom10To20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //Task 2
    public static void printPositiveOrNegative(int check) {
        if (check >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    //Task 3
    public static boolean isNegative(int check) {
        return check < 0;
    }

    //Task 4
    public static void printHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //Task 5
    public static void arraySwap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    //Task 6
    public static void fillAnArray(int[] array) {
        int num = 2;
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
            num += 3;
        }
    }

    //Task 7
    public static void searchAndMultiplication(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    //Task 8
    public static void diagonalToOne(int[][] squareArray) {
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                squareArray[i][i] = 1;
            }
        }
    }

    //Task 9
    public static void searchMinMax(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    //Task 10
    public static void isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " - високосный");
        } else {
            System.out.println(year + " - не високосный");
        }
    }

    //Task 11
    public static boolean isSumLeftAndRightEquals(int[] array) {
        int n = 2;
        for (int i = 0; i < array.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            int length = array.length - 1;
            for (int j = 0; j < array.length - n; j++) {
                sumLeft += array[j];
            }
            for (int j = 0; j < n; j++) {
                sumRight += array[length];
                length--;
            }
            if (sumLeft == sumRight) {
                return true;
            }
            if (n < array.length) {
                n++;
            }
        }
        return false;
    }

    public static void task1() {
        System.out.print("Task1: ");
        System.out.println(sumRangeFrom10To20(0, 10));
    }

    public static void task2() {
        System.out.print("Task2: ");
        printPositiveOrNegative(0);
    }

    public static void task3() {
        System.out.print("Task3: ");
        System.out.println(isNegative(21));
    }

    public static void task4() {
        System.out.print("Task4: ");
        printHello("Саша");
    }

    public static void task5() {
        System.out.print("Task5: ");
        int[] array = {1, 1, 1, 1, 0, 0, 0};
        System.out.println(Arrays.toString(array));
        arraySwap(array);
        System.out.println(Arrays.toString(array));
    }

    public static void task6() {
        System.out.print("Task6: ");
        int[] array = new int[8];
        System.out.println(Arrays.toString(array));
        fillAnArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void task7() {
        System.out.print("Task7: ");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        searchAndMultiplication(array);
        System.out.println(Arrays.toString(array));
    }

    public static void task8() {
        System.out.print("Task8: ");
        int[][] array = new int[3][3];
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        diagonalToOne(array);
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void task9() {
        System.out.print("Task9: ");
        int[] array = {0, 1, 42, 15, 21, -8, 13};
        searchMinMax(array);
    }

    public static void task10() {
        System.out.print("Task10: ");
        isLeapYear(1800);
    }

    public static void task11() {
        System.out.print("Task11: ");
        int[] array = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(isSumLeftAndRightEquals(array));
    }
}
