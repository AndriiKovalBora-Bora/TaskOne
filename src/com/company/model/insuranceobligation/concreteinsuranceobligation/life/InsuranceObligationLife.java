package com.company.model.insuranceobligation.concreteinsuranceobligation.life;

import com.company.model.insuranceobligation.CompensationCalculation;
import com.company.model.insuranceobligation.InsuranceCompany;
import com.company.model.insuranceobligation.InsuranceObligationScheme;
import com.company.model.insuranceobligation.insuranceobject.InsuranceObjectType;
import com.company.view.View;

public class InsuranceObligationLife extends InsuranceObligationScheme implements CompensationCalculation {

    InsuranceObjectType objectType;
    String cause;

    public InsuranceObligationLife() {
        objectType = InsuranceObjectType.LIFE;
    }

    @Override
    public String toString() {
        if (String.valueOf(View.bundle.getLocale().getLanguage()).equals("eu_ua"))
            return getInsuranceCompany().toString() + " | Compensasua : " + getCompensation() + " | Plata : " + getInsurancePayment() + " | Stepen riska : " + getDegreeOfRisk() + " | Prichina : " + getCause() + "\n";
        else if (String.valueOf(View.bundle.getLocale().getLanguage()).equals("eu"))
            return getInsuranceCompany().toString() + " | Compensation : " + getCompensation() + " | Insurance Payment : " + getInsurancePayment() + " | Degree Of Risk : " + getDegreeOfRisk() + " | Cause : " + getCause() + "\n";
        throw new RuntimeException();
    }

    public InsuranceObligationLife(InsuranceCompany insuranceCompany, long compensation, long insurancePayment, double degreeOfRisk, String cause) {
        super(insuranceCompany, compensation, insurancePayment, degreeOfRisk);
        this.cause = cause;
        objectType = InsuranceObjectType.LIFE;
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

    public InsuranceObjectType getObjectType() {
        return objectType;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

}
