package com.AlisonSoares.PathToCarrer.repository.mappingModels.exercicioDomain;

import com.AlisonSoares.PathToCarrer.model.exercicioDomain.finitas.ModeloResposta;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Exercicio")
@Inheritance(strategy = InheritanceType.JOINED)

@NoArgsConstructor
@Getter
@Setter
public class ExercicioMapper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exercicioID;
    private String enunciado;
    private ModeloResposta modeloResposta;

    @OneToMany(mappedBy = "exercicioID", fetch = FetchType.LAZY)
    private List<ConjuntoPossuiExercicioMapper> conjuntoPossuiExercicioMappers;
}
