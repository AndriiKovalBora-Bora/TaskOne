package com.company.model.insuranceobligation.concreteinsuranceobligation.life;

import com.company.model.insuranceobligation.CompensationCalculation;
import com.company.model.insuranceobligation.InsuranceCompany;
import com.company.model.insuranceobligation.InsuranceObligationMaker;

public class InsuranceObligationLifeMaker implements InsuranceObligationMaker {
    @Override
    public CompensationCalculation createInsuranceObligation() {
        return new InsuranceObligationLife();
    }

    @Override
    public CompensationCalculation createInsuranceObligation(InsuranceCompany insuranceCompany, long compensation, long insurancePayment, double degreeOfRisk, String param) {
        return new InsuranceObligationLife(insuranceCompany, compensation, insurancePayment, degreeOfRisk, param);
    }
}
