package com.AlisonSoares.PathToCarrer.repository.mappingModels.pathDomain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "indiceModulo")

@Getter
@Setter
@NoArgsConstructor
public class IndicesModuloMapper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long indiceModuloID;
    private int indice;

    @ManyToOne
    @JoinColumn(name = "moduloID")
    private ModuloMapper moduloID;

    @ManyToOne
    @JoinColumn(name = "conteudoID")
    private ConteudoMapper conteudoID;
}
