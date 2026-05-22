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

    @EmbeddedId
    private ComposekeyIndiceModuloMapper composekeyIndiceModuloMapper = new  ComposekeyIndiceModuloMapper();

    @ManyToOne
    @MapsId("moduloID")
    @JoinColumn(name = "moduloID")
    private ModuloMapper moduloID;

    @ManyToOne
    @JoinColumn(name = "conteudoID")
    private ConteudoMapper conteudoID;

}
