package com.company.model.insuranceobligation.insuranceobject;

import com.company.model.insuranceobligation.insuranceobject.InsuranceObjectType;

public class InsuranceObject {
    private InsuranceObjectType objectType;
    private String objectname;

    public InsuranceObject(InsuranceObjectType objectType, String objectname) {
        this.objectType = objectType;
        this.objectname = objectname;
    }

    public InsuranceObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(InsuranceObjectType objectType) {
        this.objectType = objectType;
    }

    public String getObjectname() {
        return objectname;
    }

    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }
}
