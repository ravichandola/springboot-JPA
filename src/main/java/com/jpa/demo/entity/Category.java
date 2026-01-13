package com.jpa.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "my_basket_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String imageUrl;

}
