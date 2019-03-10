package com.company.model.insuranceobligation.concreteinsuranceobligation.health;

import com.company.model.insuranceobligation.CompensationCalculation;
import com.company.model.insuranceobligation.InsuranceCompany;
import com.company.model.insuranceobligation.InsuranceObligationMaker;
import com.company.model.insuranceobligation.InsuranceObligationScheme;
import com.company.model.insuranceobligation.insuranceobject.InsuranceObjectType;

public class InsuranceObligationHealthMaker implements InsuranceObligationMaker {


    @Override
    public CompensationCalculation createInsuranceObligation() {
        return new InsuranceObligationHealth();
    }

    @Override
    public CompensationCalculation createInsuranceObligation(InsuranceCompany insuranceCompany, long compensation, long insurancePayment, double degreeOfRisk, String param) {
        return new InsuranceObligationHealth(insuranceCompany, compensation, insurancePayment, degreeOfRisk, param);
    }
}
