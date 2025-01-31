package com.estetify.backend.utils.item;

import com.estetify.backend.models.Itens;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Getter
@Setter
public class ItemService extends Itens {
    private LocalDateTime availabilityDate;
    private LocalDateTime reservedDate;
    private ArrayList<Itens> materialsUsed;

    public ItemService(LocalDateTime availabilityDate, LocalDateTime reservedDate, ArrayList<Itens> materialsUsed) {
        this.availabilityDate = availabilityDate;
        this.reservedDate = reservedDate;
        this.materialsUsed = materialsUsed;
    }
}
