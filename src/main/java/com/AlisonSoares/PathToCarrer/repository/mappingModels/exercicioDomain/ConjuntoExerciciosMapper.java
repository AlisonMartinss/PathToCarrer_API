package com.AlisonSoares.PathToCarrer.repository.mappingModels.exercicioDomain;

import com.AlisonSoares.PathToCarrer.repository.mappingModels.pathDomain.ConteudoMapper;
import com.AlisonSoares.PathToCarrer.repository.mappingModels.usuariodDomain.UsuarioMapper;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "conjuntoExercicios")
@PrimaryKeyJoinColumn(name = "conteudoID")

@NoArgsConstructor
@Getter
@Setter
public class ConjuntoExerciciosMapper extends ConteudoMapper {

    @ManyToOne
    @JoinColumn(name = "usuarioID")
    private UsuarioMapper usuarioID;

    @ManyToOne
    @JoinColumn(name = "assuntoID")
    private AssuntoMapper assuntoMapperID;

}
