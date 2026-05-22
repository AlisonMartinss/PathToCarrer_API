package com.AlisonSoares.PathToCarrer.repository.mappingModels.exercicioDomain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class ComposeKeyAlternativaObjetiva implements Serializable {

    private Long exercicioID;
    private String shieldAlternativa;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ComposeKeyAlternativaObjetiva that = (ComposeKeyAlternativaObjetiva) o;
        return Objects.equals(exercicioID, that.exercicioID) && Objects.equals(shieldAlternativa, that.shieldAlternativa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exercicioID, shieldAlternativa);
    }
}
