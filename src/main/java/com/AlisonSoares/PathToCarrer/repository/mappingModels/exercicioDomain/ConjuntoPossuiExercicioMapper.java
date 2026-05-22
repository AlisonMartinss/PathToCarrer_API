package com.AlisonSoares.PathToCarrer.repository.mappingModels.exercicioDomain;

import com.AlisonSoares.PathToCarrer.repository.mappingModels.pathDomain.ConteudoMapper;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "conjuntoPossuiExercicio")
public class ConjuntoPossuiExercicioMapper {

    @ManyToOne
    @JoinColumn(name = "conteudoID")
    private ConteudoMapper conteudoID;

    @ManyToOne
    @JoinColumn(name = "exercicioID")
    private ExercicioMapper exercicioID;
}
