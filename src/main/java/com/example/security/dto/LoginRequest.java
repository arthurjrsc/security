package com.example.security.dto;

import jakarta.validation.constraints.NotEmpty;

public record LoginRequest(
    @NotEmpty(message = "O email é obrigatório") String email,
    @NotEmpty(message = "A password é obrigatória") String password) {
    
}
