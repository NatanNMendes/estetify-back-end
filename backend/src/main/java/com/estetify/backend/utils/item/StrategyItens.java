package com.estetify.backend.utils.item;

import com.estetify.backend.models.Itens;
import com.estetify.backend.utils.enums.ItensType;

import java.time.LocalDateTime;
import java.util.Map;

interface StrategyItens {
    Itens createItem(Long id, String name, ItensType itensType, Double price, Double discount, LocalDateTime createdAt, String image, Map<String, Object> additionalAttributes);
}
