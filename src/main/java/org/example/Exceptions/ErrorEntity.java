package org.example.Exceptions;

public enum ErrorEntity {
    JOBROLERESPONSE("JobRole"),
    JRDETAILRESPONSE("JobRoleDetailResponse");

    private final String entity;
    ErrorEntity(final String entity) {
        this.entity = entity;
    }

    public String getEntity() {
        return this.entity;
    }
}
