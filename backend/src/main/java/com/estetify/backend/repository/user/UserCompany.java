package com.estetify.backend.repository.user;

import com.estetify.backend.models.Users;
import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.OperatingHours;
import com.estetify.backend.utils.enums.Sexuality;
import com.estetify.backend.utils.enums.UsersType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class UserCompany extends Users {
    private String tradeName;
    private String taxID;
    private Date establishmentDate;
    private ArrayList<OperatingHours> operatingHours;
    private String socialMediaLinks;
    private String description;

    public UserCompany(Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String phone, String email, String password, UsersType usersType, String address, LocalDateTime createdAt, String profilePhoto, String tradeName, String taxID, Date establishmentDate, ArrayList<OperatingHours> operatingHours, String socialMediaLinks, String description) {
        super(id, name, birthDate, gender, sexuality, phone, email, password, usersType, address, profilePhoto);
        this.tradeName = tradeName;
        this.taxID = taxID;
        this.establishmentDate = establishmentDate;
        this.operatingHours = operatingHours;
        this.socialMediaLinks = socialMediaLinks;
        this.description = description;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public Date getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(Date establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public ArrayList<OperatingHours> getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(ArrayList<OperatingHours> operatingHours) {
        this.operatingHours = operatingHours;
    }

    public String getSocialMediaLinks() {
        return socialMediaLinks;
    }

    public void setSocialMediaLinks(String socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
