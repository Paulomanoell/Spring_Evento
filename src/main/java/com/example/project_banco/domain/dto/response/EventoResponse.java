package com.example.project_banco.domain.dto.response;
import java.util.Date;

import com.example.project_banco.domain.entities.CategoriaEvento;
import com.example.project_banco.domain.entities.StatusEvento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventoResponse {

    private Integer IdEvento;

    private CategoriaEvento categoriaEvento;

    private StatusEvento eventoStatus;

    private String Nome;

    private Date DataHoraInicio;

    private Date DataHoraFim;

    private String Local;

    private String Descricao;

    private Integer LimiteVagas;

}

