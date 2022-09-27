package com.vtb.kortunov.lesson12;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            ReflectionRepository.connect();
            ReflectionRepository<Student> reflectionRepository = new ReflectionRepository<>(Student.class);
            Student student1 = new Student("Bob");
            reflectionRepository.save(student1);
            List<Student> students = reflectionRepository.findAll();
            reflectionRepository.deleteById(1L);
            reflectionRepository.deleteAll();
            System.out.println(students);
        } catch (ClassNotFoundException | SQLException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        } finally {
            ReflectionRepository.disconnect();
        }
    }
}
