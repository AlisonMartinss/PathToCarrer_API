package com.AlisonSoares.PathToCarrer.repository.mappingModels.exercicioDomain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Assunto")

@NoArgsConstructor
@Getter
@Setter
public class AssuntoMapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assuntoID;

    @ManyToOne
    @JoinColumn(name = "materiaID")
    private MateriaMapper materiaID;
    private String nomeAssunto;

    @OneToMany(mappedBy = "assuntoID", fetch = FetchType.LAZY)
    private List<ConjuntoExerciciosMapper> conjuntoExerciciosMappers;

}
