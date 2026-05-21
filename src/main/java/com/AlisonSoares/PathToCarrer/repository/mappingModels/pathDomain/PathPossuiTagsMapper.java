package com.AlisonSoares.PathToCarrer.repository.mappingModels.pathDomain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PathPossuiTags")

@Getter
@Setter
@NoArgsConstructor
public class PathPossuiTagsMapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pathTagsID;

    @ManyToOne
    @JoinColumn(name = "pathID")
    private PathMapper pathID;

    @ManyToOne
    @JoinColumn(name = "tagID")
    private TagsMapper tagID;
}
