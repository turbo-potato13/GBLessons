package com.vtb.kortunov.lesson4;

public class Main {

    public static void main(String[] args) {
        //MyArrayException
        String[][] strings1 = {
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3"}
        };
        try {
            System.out.println(Converter.conversion(strings1));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //MyArrayDataException
        String[][] strings2 = {
            {"1", "2", "3", "4"},
            {"1", "2F", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}
        };
        try {
            System.out.println(Converter.conversion(strings2));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Correct conclusion
        String[][] strings3 = {
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}
        };
        try {
            System.out.println(Converter.conversion(strings3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
