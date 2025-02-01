package com.estetify.backend.utils.user.userType;

import com.estetify.backend.models.Users;
import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.OperatingHours;
import com.estetify.backend.utils.enums.Sexuality;
import com.estetify.backend.utils.enums.UsersType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
public class UserCompany extends Users {

    @JsonProperty("tradeName")
    private String tradeName;

    @JsonProperty("taxID")
    private String taxID;

    @JsonProperty("establishmentDate")
    private Date establishmentDate;

    @JsonProperty("operatingHours")
    private ArrayList<OperatingHours> operatingHours;

    @JsonProperty("socialMediaLinks")
    private String socialMediaLinks;

    @JsonProperty("description")
    private String description;

    public UserCompany(Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String email, String password, UsersType usersType, String address, String profilePhoto, String tradeName, String taxID, Date establishmentDate, ArrayList<OperatingHours> operatingHours, String socialMediaLinks, String description) {
        super(id, name, birthDate, gender, sexuality, email, password, usersType, address, profilePhoto);
        this.tradeName = tradeName;
        this.taxID = taxID;
        this.establishmentDate = establishmentDate;
        this.operatingHours = operatingHours;
        this.socialMediaLinks = socialMediaLinks;
        this.description = description;
    }
}
