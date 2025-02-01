package com.estetify.backend.utils.user;


import com.estetify.backend.models.Users;
import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.enums.Sexuality;
import com.estetify.backend.utils.enums.UsersType;
import com.estetify.backend.utils.user.userStrategy.UserStrategy;
import com.estetify.backend.utils.user.userStrategy.strategies.CompanyStrategy;
import com.estetify.backend.utils.user.userStrategy.strategies.CustomerStrategy;
import com.estetify.backend.utils.user.userStrategy.strategies.HairdresserStrategy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserFactory {
    private static final Map<UsersType, UserStrategy> strategies = new HashMap<>();

    static {
        strategies.put(UsersType.CUSTOMER, new CustomerStrategy());
        strategies.put(UsersType.COMPANY, new CompanyStrategy());
        strategies.put(UsersType.HAIRDRESSER, new HairdresserStrategy());
    }

    public static Users createUser(UsersType type, Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String email, String password, String address, String profilePhoto, Map<String, Object> additionalAttributes) throws IllegalArgumentException {
        UserStrategy strategy = strategies.get(type);
        if (strategy == null) {
            throw new IllegalArgumentException("Unsupported user type: " + type);
        }
        return strategy.createUser(id, name, birthDate, gender, sexuality, email, password, address, profilePhoto, additionalAttributes);
    }
}