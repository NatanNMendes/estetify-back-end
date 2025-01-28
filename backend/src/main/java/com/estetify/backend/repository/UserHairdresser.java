package com.estetify.backend.repository;

import com.estetify.backend.models.Itens;
import com.estetify.backend.models.Users;

import java.util.ArrayList;

public class UserHairdresser extends Users {
    private Double ratings;
    private String instagramPosts;
    private ArrayList<Itens> productsAvailable;
    private ArrayList<Itens> servicesAvailable;
}
