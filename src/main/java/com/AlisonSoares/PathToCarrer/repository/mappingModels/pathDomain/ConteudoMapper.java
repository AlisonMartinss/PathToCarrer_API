package com.AlisonSoares.PathToCarrer.repository.mappingModels.pathDomain;

import com.AlisonSoares.PathToCarrer.model.pathDomain.finitas.TipoConteudo;
import com.AlisonSoares.PathToCarrer.repository.mappingModels.exercicioDomain.ConjuntoExerciciosMapper;
import com.AlisonSoares.PathToCarrer.repository.mappingModels.exercicioDomain.ConjuntoPossuiExercicioMapper;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "conteudo")
@Inheritance(strategy = InheritanceType.JOINED)

@Getter
@Setter
@NoArgsConstructor
public class ConteudoMapper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long conteudoID;
    private TipoConteudo tipoConteudo;

    @OneToMany(mappedBy = "conteudoID", fetch = FetchType.LAZY)
    private List<IndicesModuloMapper> indicesModuloMappers;

    @OneToMany(mappedBy = "conteudoID", fetch = FetchType.LAZY)
    private List<ConjuntoExerciciosMapper> conjuntoExerciciosMappers;

    @OneToMany(mappedBy = "conteudoID", fetch = FetchType.LAZY)
    private List<ConjuntoPossuiExercicioMapper> conjuntoPossuiExercicioMappers;
}
