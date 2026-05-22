package com.AlisonSoares.PathToCarrer.repository.mappingModels.pathDomain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class ComposekeyIndiceModuloMapper implements Serializable {

    private Long moduloID;

    @Column(name = "indice")
    private int indice;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ComposekeyIndiceModuloMapper that = (ComposekeyIndiceModuloMapper) o;
        return indice == that.indice && Objects.equals(moduloID, that.moduloID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moduloID, indice);
    }
}
