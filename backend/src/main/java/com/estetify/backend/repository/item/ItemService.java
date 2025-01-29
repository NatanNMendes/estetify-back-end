package com.estetify.backend.repository.item;

import com.estetify.backend.models.Itens;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ItemService extends Itens {
    private LocalDateTime availabilityDate;
    private LocalDateTime reservedDate;
    private ArrayList<Itens> materialsUsed;
}
