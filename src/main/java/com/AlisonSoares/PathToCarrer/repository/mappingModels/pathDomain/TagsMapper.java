package com.AlisonSoares.PathToCarrer.repository.mappingModels.pathDomain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "tags")

@Getter
@Setter
@NoArgsConstructor
public class TagsMapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tagID;
    private String tituloTag;

    @OneToMany(mappedBy = "tagID", fetch = FetchType.LAZY)
    private List<PathPossuiTagsMapper> pathPossuiTagsMappers;
}
