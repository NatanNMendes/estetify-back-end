package com.estetify.backend.utils.user.userType;

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
public class UserCustomer extends Users {

    @JsonProperty("shoppingCart")
    private ArrayList<Itens> shoppingCart;

    @JsonProperty("purchasedItens")
    private ArrayList<Itens> purchasedItens;

    @JsonProperty("purchaseHistory")
    private ArrayList<Itens> purchaseHistory;

    public UserCustomer(Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String email, String password, UsersType usersType, String address, String profilePhoto, ArrayList<Itens> shoppingCart, ArrayList<Itens> purchasedItens, ArrayList<Itens> purchaseHistory) {
        super(id, name, birthDate, gender, sexuality, email, password, usersType, address, profilePhoto);
        this.shoppingCart = shoppingCart;
        this.purchasedItens = purchasedItens;
        this.purchaseHistory = purchaseHistory;
    }
}
