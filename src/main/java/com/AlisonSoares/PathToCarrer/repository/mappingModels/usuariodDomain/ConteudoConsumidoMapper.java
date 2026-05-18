package com.AlisonSoares.PathToCarrer.repository.mappingModels.usuariodDomain;

import jakarta.persistence.*;

@Entity
@Table(name = "conteudoConsumido")
public class ConteudoConsumidoMapper {

    @ManyToOne
    @JoinColumn(name = "usuarioID")
    private UsuarioMapper usuarioID;

    @ManyToOne
    @JoinColumn(name = "conteudoID")
    private Long conteudoID; /*PENDENTE*/
}
