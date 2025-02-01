package com.estetify.backend.utils.item.itemStrategy.strategies;

import com.estetify.backend.models.Itens;
import com.estetify.backend.utils.enums.ItensType;
import com.estetify.backend.utils.item.itemStrategy.ItensStrategy;
import com.estetify.backend.utils.item.itemType.ItemService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServiceStrategy implements ItensStrategy {
    @Override
    public Itens createItem(Long id, String name, ItensType itensType, Double price, Double discount, LocalDateTime createdAt, String image, Map<String, Object> additionalAttributes) {
        List<Itens> materialsUsed = (List<Itens>) additionalAttributes.get("materialsUsed");
        if (materialsUsed == null) {
            materialsUsed = new ArrayList<>();
        }

        return new ItemService(id, name, itensType, price, discount, createdAt, image,
                (LocalDateTime) additionalAttributes.getOrDefault("availabilityDate", LocalDateTime.now()),
                (LocalDateTime) additionalAttributes.getOrDefault("reservedDate", LocalDateTime.now()),
                materialsUsed);
    }
}
