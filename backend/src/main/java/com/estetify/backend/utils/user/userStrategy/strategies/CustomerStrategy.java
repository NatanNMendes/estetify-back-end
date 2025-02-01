package com.estetify.backend.utils.user.userStrategy.strategies;

import com.estetify.backend.models.Itens;
import com.estetify.backend.models.Users;
import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.enums.Sexuality;
import com.estetify.backend.utils.enums.UsersType;
import com.estetify.backend.utils.user.userStrategy.UserStrategy;
import com.estetify.backend.utils.user.userType.UserCustomer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class CustomerStrategy implements UserStrategy {
    @Override
    public Users createUser(Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String email, String password, String address, String profilePhoto, Map<String, Object> additionalAttributes) {
        ArrayList<Itens> shoppingCart = new ArrayList<>();
        Object cartObj = additionalAttributes.get("shoppingCart");
        if (cartObj instanceof List<?>) {
            for (Object obj : (List<?>) cartObj) {
                if (obj instanceof Itens) {
                    shoppingCart.add((Itens) obj);
                }
            }
        }

        ArrayList<Itens> purchasedItens = new ArrayList<>();
        Object purchasedObj = additionalAttributes.get("purchasedItens");
        if (purchasedObj instanceof List<?>) {
            for (Object obj : (List<?>) purchasedObj) {
                if (obj instanceof Itens) {
                    purchasedItens.add((Itens) obj);
                }
            }
        }

        ArrayList<Itens> purchaseHistory = new ArrayList<>();
        Object historyObj = additionalAttributes.get("purchaseHistory");
        if (historyObj instanceof List<?>) {
            for (Object obj : (List<?>) historyObj) {
                if (obj instanceof Itens) {
                    purchaseHistory.add((Itens) obj);
                }
            }
        }

        return new UserCustomer(id, name, birthDate, gender, sexuality, email, password, UsersType.CUSTOMER, address, profilePhoto, shoppingCart, purchasedItens, purchaseHistory);
    }
}

