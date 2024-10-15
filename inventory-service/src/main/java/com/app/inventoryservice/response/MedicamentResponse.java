package com.app.inventoryservice.response;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record MedicamentResponse(
        String id,
        String nom,
        String description,
        Double prix,
        Integer quantiteEnStock,
        LocalDate dateExpiration
) {
}
