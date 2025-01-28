package com.estetify.backend.repository;

import com.estetify.backend.models.Itens;
import com.estetify.backend.models.Users;

import java.util.ArrayList;

public class UserCustomer extends Users {
    private ArrayList<Itens> shoppingCart;
    private ArrayList<Itens> purchasedItens;
    private ArrayList<Itens> purchaseHistory;

    public UserCustomer(ArrayList<Itens> shoppingCart, ArrayList<Itens> purchasedItens, ArrayList<Itens> purchaseHistory) {
        this.shoppingCart = shoppingCart;
        this.purchasedItens = purchasedItens;
        this.purchaseHistory = purchaseHistory;
    }
}
