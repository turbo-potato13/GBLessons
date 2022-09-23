package com.vtb.kortunov.lesson2;

public class Group {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public Group(String groupName) {
    }

    public void addEmployee(Employee employee) {
        this.employees[size] = employee;
        size++;
    }

    public void removeEmployee(int index) {
        this.employees[index] = null;
    }

    public void removeAll() {
        this.employees = null;
    }

    public void infoAll() {
        try {
            for (Employee employee : employees) {
                if (employee != null) {
                    employee.info();
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Группа пуста");
        }
    }
}
