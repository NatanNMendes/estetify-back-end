package com.estetify.backend.utils.user.userStrategy.strategies;

import com.estetify.backend.models.Itens;
import com.estetify.backend.models.Users;
import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.enums.Sexuality;
import com.estetify.backend.utils.enums.UsersType;
import com.estetify.backend.utils.user.userStrategy.UserStrategy;
import com.estetify.backend.utils.user.userType.UserHairdresser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class HairdresserStrategy implements UserStrategy {
    @Override
    public Users createUser(Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String email, String password, String address, String profilePhoto, Map<String, Object> additionalAttributes) {
        Double ratings = (Double) additionalAttributes.get("ratings");
        String instagramPosts = (String) additionalAttributes.get("instagramPosts");

        ArrayList<Itens> itensAvailable = new ArrayList<>();
        Object itensObj = additionalAttributes.get("itensAvailable");
        if (itensObj instanceof List<?>) {
            for (Object obj : (List<?>) itensObj) {
                if (obj instanceof Itens) {
                    itensAvailable.add((Itens) obj);
                }
            }
        }

        return new UserHairdresser(id, name, birthDate, gender, sexuality, email, password, UsersType.HAIRDRESSER, address, profilePhoto, ratings, instagramPosts, itensAvailable);
    }
}