package com.estetify.backend.repository;

import com.estetify.backend.models.Users;
import com.estetify.backend.utils.OperatingHours;

import java.util.ArrayList;
import java.util.Date;

public class UserCompany extends Users {
    private String tradeName;
    private String taxID;
    private Date establishmentDate;
    private ArrayList<OperatingHours> operatingHours;
    private String socialMediaLinks;
    private String description;


}
