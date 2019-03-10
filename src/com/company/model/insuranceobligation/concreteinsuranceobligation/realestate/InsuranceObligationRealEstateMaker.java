package com.company.model.insuranceobligation.concreteinsuranceobligation.realestate;

import com.company.model.insuranceobligation.CompensationCalculation;
import com.company.model.insuranceobligation.InsuranceCompany;
import com.company.model.insuranceobligation.InsuranceObligationMaker;

public class InsuranceObligationRealEstateMaker implements InsuranceObligationMaker {
    @Override
    public CompensationCalculation createInsuranceObligation() {
        return new InsuranceObligationRealEstate();
    }

    @Override
    public CompensationCalculation createInsuranceObligation(InsuranceCompany insuranceCompany, long compensation, long insurancePayment, double degreeOfRisk, String param) {
        return new InsuranceObligationRealEstate(insuranceCompany, compensation, insurancePayment, compensation, Double.valueOf(param));
    }
}
