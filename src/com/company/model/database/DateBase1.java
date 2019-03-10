package com.company.model.database;

import com.company.model.insuranceobligation.InsuranceCompany;
import com.company.model.insuranceobligation.InsuranceObligationScheme;
import com.company.model.insuranceobligation.concreteinsuranceobligation.health.InsuranceObligationHealth;
import com.company.model.insuranceobligation.concreteinsuranceobligation.life.InsuranceObligationLife;
import com.company.model.insuranceobligation.concreteinsuranceobligation.movableestate.InsuranceObligationmMovableEstate;
import com.company.model.insuranceobligation.concreteinsuranceobligation.realestate.InsuranceObligationRealEstate;

public enum DateBase1 {
    RECORD1(new InsuranceObligationHealth(new InsuranceCompany("Healthy People","Street 2"),150,10,0.5,"Cold")),
    RECORD2(new InsuranceObligationLife(new InsuranceCompany("Be Alive","Street 4"),300,5,0.1,"Road accident")),
    RECORD3(new InsuranceObligationRealEstate(new InsuranceCompany("Save Your Property","Street 8"),400,20,0.2,500)),
    RECORD4(new InsuranceObligationmMovableEstate(new InsuranceCompany("Save Goods","Street 12"),50,1,0.9,2)),
    RECORD5(new InsuranceObligationHealth(new InsuranceCompany("HealthyPeople","Street 2"),150,10,0.5,"Leukemia")),
    RECORD6(new InsuranceObligationHealth(new InsuranceCompany("HealthyPeople","Street 2"),150,10,0.5,"Blood Pressure"));

    private final InsuranceObligationScheme insuranceObligation;

    DateBase1(InsuranceObligationScheme insuranceObligation) {
        this.insuranceObligation = insuranceObligation;
    }

    public InsuranceObligationScheme getInsuranceObligation() {
        return insuranceObligation;
    }
}
