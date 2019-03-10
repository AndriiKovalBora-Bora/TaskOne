package com.company.model.database;

public enum IllnessName {
    ILLNESS_NAME_COLD("Cold"),
    ILLNESS_NAME_LEUKEMIA("Leukemia"),
    ILLNESS_NAME_BLOOD_PRESSURE("Blood Pressure"),
    ILLNESS_NAME_HEART_ATTRACK("Heart Attack");

    private String illnessName;

    IllnessName(String illnessName) {
        this.illnessName = illnessName;
    }

    public String getIllnessName() {
        return illnessName;
    }
}
