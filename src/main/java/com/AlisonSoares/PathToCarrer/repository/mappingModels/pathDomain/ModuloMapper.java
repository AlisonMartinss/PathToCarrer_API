package com.AlisonSoares.PathToCarrer.repository.mappingModels.pathDomain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "modulo")

@Getter
@Setter
@NoArgsConstructor
public class ModuloMapper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long moduloID;

    @ManyToOne
    @JoinColumn(name = "pathID")
    private PathMapper pathID;

    private String titulo;
    private String sobre;
    private LocalDate ultimaAtualizacao;

    @OneToMany(mappedBy = "moduloID", fetch = FetchType.LAZY)
    private List<IndicesModuloMapper> indicesModuloMappers;
}
