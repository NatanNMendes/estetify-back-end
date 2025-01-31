package com.estetify.backend.utils.item;

import com.estetify.backend.models.Itens;
import com.estetify.backend.utils.Dimensions;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemProduct extends Itens {
    private String mark;
    private String barcode;
    private Integer quantityStock;
    private Dimensions dimensions;
}
