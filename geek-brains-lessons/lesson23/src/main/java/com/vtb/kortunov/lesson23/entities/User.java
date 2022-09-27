package com.vtb.kortunov.lesson23.entities;

import lombok.Data;
import org.springframework.context.annotation.Scope;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
@Scope("prototype")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private Integer age;

    public User() {
    }

    @Override
    public String toString() {
        return String.format("[Id: %d], [Name: %s], [Age: %d]", id, name, age);
    }
}
