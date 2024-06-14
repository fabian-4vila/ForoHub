package com.forohub_challenge.forohub.domain.topicos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        Estado status,
        @NotNull
        Long autorId,
        @NotBlank
        String nombreCurso
) {
}