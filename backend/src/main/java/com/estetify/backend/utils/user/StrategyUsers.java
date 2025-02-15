package com.estetify.backend.utils.user;

import com.estetify.backend.models.Users;
import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.enums.Sexuality;

import java.util.Date;
import java.util.Map;

interface StrategyUsers {
    Users createUser(Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String email, String password, String address, String profilePhoto, Map<String, Object> additionalAttributes);
}
