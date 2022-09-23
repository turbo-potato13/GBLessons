package com.vtb.kortunov.lesson2;

public class Employee {

    private final String name;
    private final String email;
    private final int age;
    private final String position;

    public Employee(String name, String email, int age, String position) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.position = position;
    }

    public void info() {
        System.out.printf("Employee:[ name = %s, email = %s, age = %d, position = %s]\n", name, email, age, position);
    }

}
