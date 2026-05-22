package com.AlisonSoares.PathToCarrer.repository.mappingModels.usuariodDomain;

import com.AlisonSoares.PathToCarrer.repository.mappingModels.exercicioDomain.ConjuntoExerciciosMapper;
import com.AlisonSoares.PathToCarrer.repository.mappingModels.pathDomain.PathMapper;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="usuario")
public class UsuarioMapper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioID;
    private String userName;
    private String nome;
    private Date dtNascimento;

    @OneToMany(mappedBy = "usuarioID", fetch = FetchType.LAZY)
    private List<ConteudoConsumidoMapper> conteudoConsumidos;

    @OneToMany(mappedBy = "usuarioID", fetch = FetchType.LAZY)
    private List<PathMapper> pathMapper;

    @OneToMany(mappedBy = "usuarioID", fetch = FetchType.LAZY)
    private List<ConjuntoExerciciosMapper> conjuntoExerciciosMappers;


}
