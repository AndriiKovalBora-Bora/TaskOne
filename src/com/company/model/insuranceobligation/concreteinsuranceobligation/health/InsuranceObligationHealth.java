package com.company.model.insuranceobligation.concreteinsuranceobligation.health;

import com.company.model.insuranceobligation.CompensationCalculation;
import com.company.model.insuranceobligation.InsuranceCompany;
import com.company.model.insuranceobligation.InsuranceObligationScheme;
import com.company.model.insuranceobligation.insuranceobject.InsuranceObjectType;
import com.company.view.View;

public class InsuranceObligationHealth extends InsuranceObligationScheme implements CompensationCalculation {

    private InsuranceObjectType objectType;
    private String illness;

    public InsuranceObligationHealth() {
        objectType = InsuranceObjectType.HEALTH;
    }

    @Override
    public String toString() {
        if (String.valueOf(View.bundle.getLocale().getLanguage()).equals("eu_ua"))
            return getInsuranceCompany().toString() + " | Compensasua : " + getCompensation() + " | Plata : " + getInsurancePayment() + " | Stepen riska : " + getDegreeOfRisk() + " | Bolezn : " + getIllness() + "\n";
        if (String.valueOf(View.bundle.getLocale().getLanguage()).equals("eu"))
            return getInsuranceCompany().toString() + " | Compensation : " + getCompensation() + " | Insurance Payment : " + getInsurancePayment() + " | Degree Of Risk : " + getDegreeOfRisk() + " | Illness : " + getIllness() + "\n";
        throw new RuntimeException();
    }

    public InsuranceObligationHealth(InsuranceCompany insuranceCompany, long compensation, long insurancePayment, double degreeOfRisk, String illness) {
        super(insuranceCompany, compensation, insurancePayment, degreeOfRisk);
        this.illness = illness;
        objectType = InsuranceObjectType.HEALTH;
    }

    @Override
    public long calculateCompensation(double coefficient) {
        return (long) (getCompensation() * coefficient);
    }

    @Override
    public long calculateInsurancePayment(double coefficient) {
        return (long) (getInsurancePayment() * coefficient);
    }

    @Override
    public long calculateDegreeOfRisk(double coefficient) {
        return (long) (getDegreeOfRisk() * coefficient);
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public InsuranceObjectType getObjectType() {
        return objectType;
    }

}
