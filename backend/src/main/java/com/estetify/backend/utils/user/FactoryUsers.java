package com.estetify.backend.utils.user;

import com.estetify.backend.models.Users;
import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.enums.Sexuality;
import com.estetify.backend.utils.enums.UsersType;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FactoryUsers {
    private static final Map<UsersType, StrategyUsers> strategies = new HashMap<>();

    static {
        strategies.put(UsersType.CUSTOMER, new StrategyUsersCustomer());
        strategies.put(UsersType.COMPANY, new StrategyUsersCompany());
        strategies.put(UsersType.HAIRDRESSER, new StrategyUsersHairdresser());
    }

    public static Users createUser(UsersType type, Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String email, String password, String address, String profilePhoto, Map<String, Object> additionalAttributes) throws IllegalArgumentException {
        StrategyUsers strategy = strategies.get(type);
        if (strategy == null) {
            throw new IllegalArgumentException("Unsupported user type: " + type);
        }
        return strategy.createUser(id, name, birthDate, gender, sexuality, email, password, address, profilePhoto, additionalAttributes);
    }
}