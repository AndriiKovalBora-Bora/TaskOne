package com.company.model.insuranceobligation;

public interface InsuranceObligationMaker {
    CompensationCalculation createInsuranceObligation();
    CompensationCalculation createInsuranceObligation(InsuranceCompany insuranceCompany, long compensation, long insurancePayment, double degreeOfRisk, String param);
}
