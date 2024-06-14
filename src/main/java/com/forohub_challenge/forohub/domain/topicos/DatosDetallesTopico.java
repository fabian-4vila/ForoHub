package com.forohub_challenge.forohub.domain.topicos;

import java.time.LocalDateTime;

public record DatosDetallesTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha,
        Estado status,
        Long autorId,
        String nombreCurso
) {
    public DatosDetallesTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFecha(),
                topico.getStatus(),
                topico.getAutor().getId(),
                topico.getNombreCurso()
        );
    }
}
