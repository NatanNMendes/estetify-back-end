package com.estetify.backend.models;

import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.enums.Sexuality;
import com.estetify.backend.utils.enums.UsersType;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @NotBlank(message = "\n" + "The name is mandatory")
    @Size(max = 255, message = "\n" + "The name cannot be longer than 100 characters")
    @JsonProperty("name")
    private String name;

    @JsonProperty("birthDate")
    private Date birthDate;

    @Enumerated(EnumType.STRING)
    @JsonProperty("gender")
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @JsonProperty("sexuality")
    private Sexuality sexuality;

    @NotBlank(message = "\n" + "The email is mandatory")
    @Email(message = "Invalid email")
    @JsonProperty("email")
    private String email;

    @NotBlank(message = "\n" + "The password is mandatory")
    @Size(min = 8, message = "The password must be at least 8 characters long")
    @JsonProperty("password")
    private String password;

    @Enumerated(EnumType.STRING)
    @JsonProperty("usersType")
    private UsersType usersType;

    @JsonProperty("address")
    private String address;

    @JsonProperty("createdAt")
    private LocalDateTime createdAt;

    @JsonProperty("profilePhoto")
    private String profilePhoto;

    public Users(Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String email, String password, UsersType usersType, String address, String profilePhoto) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.sexuality = sexuality;
        this.email = email;
        this.password = password;
        this.usersType = usersType;
        this.address = address;
        this.profilePhoto = profilePhoto;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}
