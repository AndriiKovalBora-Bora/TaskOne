package com.company.model.insuranceobligation.concreteinsuranceobligation.movableestate;

import com.company.model.insuranceobligation.CompensationCalculation;
import com.company.model.insuranceobligation.InsuranceCompany;
import com.company.model.insuranceobligation.InsuranceObligationMaker;

public class InsuranceObligationmMovableEstateMaker implements InsuranceObligationMaker {
    @Override
    public CompensationCalculation createInsuranceObligation() {
        return new InsuranceObligationmMovableEstate();
    }

    @Override
    public CompensationCalculation createInsuranceObligation(InsuranceCompany insuranceCompany, long compensation, long insurancePayment, double degreeOfRisk, String param) {
        return new InsuranceObligationmMovableEstate(insuranceCompany, compensation,insurancePayment, degreeOfRisk, Double.valueOf(param));
    }
}
