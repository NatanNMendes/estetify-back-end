package com.estetify.backend.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dimensions {
    private Double height;
    private Double width;
    private Double length;

    public Dimensions(Double height, Double width, Double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
}
