package com.AlisonSoares.PathToCarrer.repository.mappingModels.exercicioDomain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Materia")

@NoArgsConstructor
@Getter
@Setter
public class MateriaMapper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long materiaID;
    private String nomeMateria;

    @OneToMany(mappedBy = "materiaID", fetch = FetchType.LAZY)
    private List<AssuntoMapper> assuntoMapperList;
}
