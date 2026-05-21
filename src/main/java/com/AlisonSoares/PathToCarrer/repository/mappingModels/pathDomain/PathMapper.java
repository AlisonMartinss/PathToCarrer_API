package com.AlisonSoares.PathToCarrer.repository.mappingModels.pathDomain;

import com.AlisonSoares.PathToCarrer.repository.mappingModels.usuariodDomain.UsuarioMapper;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="path")

@Getter
@Setter
@NoArgsConstructor
public class PathMapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pathID;
    private String sobre;

    @ManyToOne
    @JoinColumn(name = "usuarioID")
    private UsuarioMapper usuarioID;

    @OneToMany(mappedBy = "pathID", fetch = FetchType.LAZY)
    private List<PathPossuiTagsMapper> pathPossuiTagsMappers;

    @OneToMany(mappedBy = "pathID", fetch = FetchType.LAZY)
    private List<ModuloMapper> moduloMappers;
}
