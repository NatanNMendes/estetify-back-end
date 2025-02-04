package com.estetify.backend.utils.item;

import com.estetify.backend.models.Itens;
import com.estetify.backend.utils.enums.ItensType;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class FactoryItens {
    private static final Map<ItensType, StrategyItens> strategies = new HashMap<>();

    static {
        strategies.put(ItensType.PRODUCT, new StrategyProductItens());
        strategies.put(ItensType.SERVICE, new StrategyServiceItens());
    }

    public static Itens createItem(ItensType type, Long id, String name, Double price, Double discount, LocalDateTime createdAt, String image, Map<String, Object> additionalAttributes) {
        StrategyItens strategy = strategies.get(type);
        if (strategy == null) {
            throw new IllegalArgumentException("Unsupported item type: " + type);
        }
        return strategy.createItem(id, name, type, price, discount, createdAt, image, additionalAttributes);
    }
}
