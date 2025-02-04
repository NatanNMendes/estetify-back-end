package com.estetify.backend.utils.item;

import com.estetify.backend.models.Itens;
import com.estetify.backend.utils.enums.ItensType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
class ItensService extends Itens {
    private LocalDateTime availabilityDate;
    private LocalDateTime reservedDate;
    private List<Itens> materialsUsed;

    ItensService(Long id, String name, ItensType itensType, Double price, Double discount, LocalDateTime createdAt, String image, LocalDateTime availabilityDate, LocalDateTime reservedDate, List<Itens> materialsUsed) {
        super(id, name, itensType, price, discount, createdAt, image);
        this.availabilityDate = availabilityDate;
        this.reservedDate = reservedDate;
        this.materialsUsed = materialsUsed != null ? materialsUsed : new ArrayList<>();
    }
}
