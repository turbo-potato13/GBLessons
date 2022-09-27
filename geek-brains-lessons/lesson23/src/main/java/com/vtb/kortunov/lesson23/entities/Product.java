package com.vtb.kortunov.lesson23.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String title;

    @Column
    private Integer price;

    public Product() {
    }

    @Override
    public String toString() {
        return String.format("[Id: %d], [Title: %s], [Price: %d]", id, title, price);
    }
}
