package com.company.model.insuranceobligation;

public interface CompensationCalculation {
    long calculateCompensation(double coefficient);
    long calculateInsurancePayment(double coefficient);
    long calculateDegreeOfRisk(double coefficient);

}
