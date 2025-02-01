package com.estetify.backend.utils.user.userStrategy.strategies;

import com.estetify.backend.models.Users;
import com.estetify.backend.utils.OperatingHours;
import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.enums.Sexuality;
import com.estetify.backend.utils.enums.UsersType;
import com.estetify.backend.utils.user.userStrategy.UserStrategy;
import com.estetify.backend.utils.user.userType.UserCompany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class CompanyStrategy implements UserStrategy {
    @Override
    public Users createUser(Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String email, String password, String address, String profilePhoto, Map<String, Object> additionalAttributes) {
        ArrayList<OperatingHours> operatingHours = new ArrayList<>();
        Object hoursObj = additionalAttributes.get("operatingHours");
        if (hoursObj instanceof List<?>) {
            for (Object obj : (List<?>) hoursObj) {
                if (obj instanceof OperatingHours) {
                    operatingHours.add((OperatingHours) obj);
                }
            }
        }

        return new UserCompany(id, name, birthDate, gender, sexuality, email, password, UsersType.COMPANY, address, profilePhoto,
                (String) additionalAttributes.get("tradeName"),
                (String) additionalAttributes.get("taxID"),
                (Date) additionalAttributes.get("establishmentDate"),
                operatingHours,
                (String) additionalAttributes.get("socialMediaLinks"),
                (String) additionalAttributes.get("description"));
    }
}

