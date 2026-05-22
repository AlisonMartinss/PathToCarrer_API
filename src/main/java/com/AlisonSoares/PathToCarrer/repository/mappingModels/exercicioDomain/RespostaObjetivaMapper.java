package com.AlisonSoares.PathToCarrer.repository.mappingModels.exercicioDomain;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "respostaObjetiva")
@PrimaryKeyJoinColumn(name = "exercicioID")

@NoArgsConstructor
@Getter
@Setter
public class RespostaObjetivaMapper extends ExercicioMapper {
    private String alternativaCorreta;
}
