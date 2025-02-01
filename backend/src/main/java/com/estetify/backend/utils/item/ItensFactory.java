package com.estetify.backend.utils.item;

import com.estetify.backend.models.Itens;
import com.estetify.backend.utils.enums.ItensType;
import com.estetify.backend.utils.item.itemStrategy.ItensStrategy;
import com.estetify.backend.utils.item.itemStrategy.strategies.ProductStrategy;
import com.estetify.backend.utils.item.itemStrategy.strategies.ServiceStrategy;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ItensFactory {
    private static final Map<ItensType, ItensStrategy> strategies = new HashMap<>();

    static {
        strategies.put(ItensType.PRODUCT, new ProductStrategy());
        strategies.put(ItensType.SERVICE, new ServiceStrategy());
    }

    public static Itens createItem(ItensType type, Long id, String name, Double price, Double discount, LocalDateTime createdAt, String image, Map<String, Object> additionalAttributes) {
        ItensStrategy strategy = strategies.get(type);
        if (strategy == null) {
            throw new IllegalArgumentException("Unsupported item type: " + type);
        }
        return strategy.createItem(id, name, type, price, discount, createdAt, image, additionalAttributes);
    }
}
