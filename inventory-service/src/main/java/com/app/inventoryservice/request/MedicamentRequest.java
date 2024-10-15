package com.app.inventoryservice.request;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record MedicamentRequest(
        String id,
        @NotNull(message = "nom is required")
        String nom,
        String description,
        @NotNull(message = "prix is required")
        Double prix,
        @NotNull(message = "quantiteEnStock is required")
        Integer quantiteEnStock,
        @NotNull(message = "dateExpiration is required")
        LocalDate dateExpiration
) {
}
