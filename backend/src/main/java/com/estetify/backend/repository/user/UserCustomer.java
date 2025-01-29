package com.estetify.backend.repository.user;

import com.estetify.backend.models.Itens;
import com.estetify.backend.models.Users;
import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.enums.Sexuality;
import com.estetify.backend.utils.enums.UsersType;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "user_customers")
@PrimaryKeyJoinColumn(name = "user_id")
public class UserCustomer extends Users {

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_customer_id")
    private ArrayList<Itens> shoppingCart;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_customer_id")
    private ArrayList<Itens> purchasedItens;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_customer_id")
    private ArrayList<Itens> purchaseHistory;

    public UserCustomer(Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String phone, String email, String password, UsersType usersType, String address, LocalDateTime createdAt, String profilePhoto, ArrayList<Itens> shoppingCart, ArrayList<Itens> purchasedItens, ArrayList<Itens> purchaseHistory) {
        super(id, name, birthDate, gender, sexuality, phone, email, password, usersType, address, profilePhoto);
        this.shoppingCart = shoppingCart;
        this.purchasedItens = purchasedItens;
        this.purchaseHistory = purchaseHistory;
    }

    public ArrayList<Itens> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Itens> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public ArrayList<Itens> getPurchasedItens() {
        return purchasedItens;
    }

    public void setPurchasedItens(ArrayList<Itens> purchasedItens) {
        this.purchasedItens = purchasedItens;
    }

    public ArrayList<Itens> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(ArrayList<Itens> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
}
