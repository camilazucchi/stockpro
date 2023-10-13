package com.stockpro.models;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /* O campo "id" será uma chave primária e, ao inserir um novo registro no banco de dados,
    o sistema de gerenciamento de banco de dados gerará automaticamente um valor exclusivo para ele. */
    private String name;
    private String description;
    private Double price;
    private int stockQuantity;

}
