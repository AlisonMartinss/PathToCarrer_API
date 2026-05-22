package com.AlisonSoares.PathToCarrer.repository.mappingModels.pathDomain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class ComposeKeyPathPossuiTags implements Serializable {

    private Long pathID;
    private Long tagID;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ComposeKeyPathPossuiTags that = (ComposeKeyPathPossuiTags) o;
        return Objects.equals(pathID, that.pathID) && Objects.equals(tagID, that.tagID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pathID, tagID);
    }
}
