package com.estetify.backend.repository.user;

import com.estetify.backend.models.Itens;
import com.estetify.backend.models.Users;
import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.enums.Sexuality;
import com.estetify.backend.utils.enums.UsersType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class UserHairdresser extends Users {
    private Double ratings;
    private String instagramPosts;
    private ArrayList<Itens> productsAvailable;
    private ArrayList<Itens> servicesAvailable;

    public UserHairdresser(Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String phone, String email, String password, UsersType usersType, String address, LocalDateTime createdAt, String profilePhoto, Double ratings, String instagramPosts, ArrayList<Itens> productsAvailable, ArrayList<Itens> servicesAvailable) {
        super(id, name, birthDate, gender, sexuality, phone, email, password, usersType, address, profilePhoto);
        this.ratings = ratings;
        this.instagramPosts = instagramPosts;
        this.productsAvailable = productsAvailable;
        this.servicesAvailable = servicesAvailable;
    }
}
