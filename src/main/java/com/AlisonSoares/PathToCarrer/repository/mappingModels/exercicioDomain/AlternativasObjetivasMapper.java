package com.AlisonSoares.PathToCarrer.repository.mappingModels.exercicioDomain;

import jakarta.persistence.*;

@Entity
@Table(name = "alternativaObjetivas")
public class AlternativasObjetivasMapper {

    @EmbeddedId
    private ComposeKeyAlternativaObjetiva alternativaObjetiva =  new ComposeKeyAlternativaObjetiva();
    public String corpoAlternativa;

    @ManyToOne
    @MapsId("moduloID")
    @JoinColumn(name = "exercicioID")
    private ExercicioMapper exercicioID;
}
