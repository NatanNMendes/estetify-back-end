package com.estetify.backend.models;

import com.estetify.backend.utils.enums.ItensType;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class Itens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @NotBlank(message = "\n" + "The name is mandatory")
    @Size(max = 255, message = "\n" + "The name cannot be longer than 100 characters")
    @JsonProperty("name")
    private String name;

    @Enumerated(EnumType.STRING)
    @JsonProperty("itensType")
    private ItensType itensType;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("discount")
    private Double discount;

    @JsonProperty("createdAt")
    private LocalDateTime createdAt;

    @JsonProperty("image")
    private String image;

    public Itens(Long id, String name, ItensType itensType, Double price, Double discount, LocalDateTime createdAt, String image) {
        this.id = id;
        this.name = name;
        this.itensType = itensType;
        this.price = price;
        this.discount = discount;
        this.createdAt = createdAt;
        this.image = image;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}
