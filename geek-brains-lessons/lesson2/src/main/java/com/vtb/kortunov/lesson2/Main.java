package com.vtb.kortunov.lesson2;

public class Main {

    public static void main(String[] args) {
        //Task 1
        Employee employee = new Employee("Гена", "gena@gmail.com", 42, "сварщик");
        employee.info();

        //Task 2,3
        Group group = new Group("group");
        group.addEmployee(employee);
        group.addEmployee(new Employee("Леха", "lexa@gmail.com", 25, "электрик"));
        group.infoAll();
        group.removeEmployee(1);
        group.infoAll();
        group.removeAll();
        group.infoAll();
    }
}
