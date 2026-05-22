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

    @ManyToOne
    @MapsId("pathID")
    @JoinColumn(name = "pathID")
    private PathMapper pathID;

    @ManyToOne
    @MapsId("tagID")
    @JoinColumn(name = "tagID")
    private TagsMapper tagID;
}
