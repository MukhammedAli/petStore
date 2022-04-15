package com.example.petstore.entities;

import lombok.Data;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

@Data
@Entity(name = "AppUser")
@Table(name = "app_user")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_id_seq",
            sequenceName = "user_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "user_id_seq"
    )
    @Column(name = "user_id")
    private int user_id;

    @Column (
            name = "username",
            nullable = false,
            unique = true
    )
    private String username;

    @Column (
            name = "user_password",
            nullable = false
    )
    private String user_password;

    @Column (
            name = "product_category_id",
            nullable = false
    )
    private int product_category_id;

    @Column (name = "product_price")
    private long product_price;

    @Column (name = "product_img")
    private String product_img;

    @Column (
            name = "product_animal_id",
            nullable = false
    )
    private int product_animal_id;

    @Column (
            name = "product_reivew_id",
            nullable = false
    )
    private int product_review_id;

    @Column (name = "product_review_no")
    private int product_review_no;

    @Column (name = "product_sku")
    private int product_sku;

    @Column (name = "product_discount")
    private int product_discount;

    @Column (name = "product_discount_price")
    private long product_discount_price;

    @OneToMany(mappedBy = "user", targetEntity = Order.class, cascade = CascadeType.ALL)
    private Set<Order> orders;

    @OneToMany(mappedBy = "user", targetEntity = Review.class, cascade = CascadeType.ALL)
    private Set<Review> reviews;
}
