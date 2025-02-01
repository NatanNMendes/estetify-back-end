package com.estetify.backend.utils.item.itemStrategy.strategies;

import com.estetify.backend.models.Itens;
import com.estetify.backend.utils.Dimensions;
import com.estetify.backend.utils.enums.ItensType;
import com.estetify.backend.utils.item.itemStrategy.ItensStrategy;
import com.estetify.backend.utils.item.itemType.ItemProduct;

import java.time.LocalDateTime;
import java.util.Map;

public class ProductStrategy implements ItensStrategy {
    @Override
    public Itens createItem(Long id, String name, ItensType itensType, Double price, Double discount, LocalDateTime createdAt, String image, Map<String, Object> additionalAttributes) {
        return new ItemProduct(id, name, itensType, price, discount, createdAt, image,
                (String) additionalAttributes.getOrDefault("mark", ""),
                (String) additionalAttributes.getOrDefault("barcode", ""),
                (Integer) additionalAttributes.getOrDefault("quantityStock", 0),
                (Dimensions) additionalAttributes.get("dimensions"));
    }
}
