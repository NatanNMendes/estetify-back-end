package com.estetify.backend.models;

import com.estetify.backend.utils.enums.Gender;
import com.estetify.backend.utils.enums.Sexuality;
import com.estetify.backend.utils.enums.UsersType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Date;

@MappedSuperclass
public abstract class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "The name is mandatory")
    @Size(max = 255, message = "\n" + "The name cannot be longer than 255 characters")
    @Column(name = "name")
    private String name;

    @Column(name = "birth_date", nullable = false)
    private Date birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexuality", nullable = false)
    private Sexuality sexuality;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Invalid email")
    @Column(name = "email",unique = true, nullable = false)
    private String phone;

    @NotBlank(message = "\n" + "Password is mandatory")
    @Size(min = 8, message = "\n" + "The password must be at least 8 characters long")
    @Column(name = "password", nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private String password;

    @Column(name = "address", updatable = false)
    private UsersType usersType;

    @Column(name = "created_at", updatable = false)
    private String address;

    @Column(name = "profile_photo")
    private LocalDateTime createdAt;

    @Column(name = "profile_photo")
    private String profilePhoto;

    public Users(Long id, String name, Date birthDate, Gender gender, Sexuality sexuality, String phone, String email, String password, UsersType usersType, String address, String profilePhoto) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.sexuality = sexuality;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.usersType = usersType;
        this.address = address;
        this.profilePhoto = profilePhoto;
    }

    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Sexuality getSexuality() {
        return sexuality;
    }

    public void setSexuality(Sexuality sexuality) {
        this.sexuality = sexuality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsersType getUsersType() {
        return usersType;
    }

    public void setUsersType(UsersType usersType) {
        this.usersType = usersType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt() {
        this.createdAt = LocalDateTime.now();
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}
