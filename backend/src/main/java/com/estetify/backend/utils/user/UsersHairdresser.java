package com.estetify.backend.utils.user;

import com.estetify.backend.models.Itens;
import com.estetify.backend.models.Users;
import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.enums.Sexuality;
import com.estetify.backend.utils.enums.UsersType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
class UsersHairdresser extends Users {

    @JsonProperty("ratings")
    private Double ratings;

    @JsonProperty("instagramPosts")
    private String instagramPosts;

    @JsonProperty("itensAvailable")
    private ArrayList<Itens> itensAvailable;

    UsersHairdresser(Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String email, String password, UsersType usersType, String address, String profilePhoto, Double ratings, String instagramPosts, ArrayList<Itens> itensAvailable) {
        super(id, name, birthDate, gender, sexuality, email, password, usersType, address, profilePhoto);
        this.ratings = ratings;
        this.instagramPosts = instagramPosts;
        this.itensAvailable = itensAvailable;
    }
}
