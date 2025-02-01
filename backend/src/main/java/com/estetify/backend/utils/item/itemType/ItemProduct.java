package com.estetify.backend.utils.item.itemType;

import com.estetify.backend.models.Itens;
import com.estetify.backend.utils.Dimensions;
import com.estetify.backend.utils.enums.ItensType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ItemProduct extends Itens {
    private String mark;
    private String barcode;
    private Integer quantityStock;
    private Dimensions dimensions;

    public ItemProduct(Long id, String name, ItensType itensType, Double price, Double discount, LocalDateTime createdAt, String image, String mark, String barcode, Integer quantityStock, Dimensions dimensions) {
        super(id, name, itensType, price, discount, createdAt, image);
        this.mark = mark;
        this.barcode = barcode;
        this.quantityStock = quantityStock;
        this.dimensions = dimensions;
    }
}
