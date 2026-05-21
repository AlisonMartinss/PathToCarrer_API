package com.AlisonSoares.PathToCarrer.repository.mappingModels.pathDomain;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Table(name = "aula")
@PrimaryKeyJoinColumn(name = "aulaID")

@Getter
@Setter
@NoArgsConstructor
public class AulaMapper extends ConteudoMapper {

    private String titulo;
    private String sobre;
    private String ytLink;
    private boolean ativo;
    private boolean excluida;
    private LocalDate ultimaAtualizacao;

}
