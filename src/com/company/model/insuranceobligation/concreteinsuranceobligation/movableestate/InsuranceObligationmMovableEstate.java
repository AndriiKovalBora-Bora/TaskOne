package com.company.model.insuranceobligation.concreteinsuranceobligation.movableestate;

import com.company.model.insuranceobligation.CompensationCalculation;
import com.company.model.insuranceobligation.InsuranceCompany;
import com.company.model.insuranceobligation.InsuranceObligationScheme;
import com.company.model.insuranceobligation.insuranceobject.InsuranceObjectType;
import com.company.view.View;

public class InsuranceObligationmMovableEstate extends InsuranceObligationScheme implements CompensationCalculation {

    InsuranceObjectType objectType;
    double weight;

    public InsuranceObligationmMovableEstate() {
        objectType = InsuranceObjectType.MOVABLE_ESTATE;
    }

    @Override
    public String toString() {
        if (String.valueOf(View.bundle.getLocale().getLanguage()).equals("eu_ua"))
            return getInsuranceCompany().toString() + " | Compensasua : " + getCompensation() + " | Plata : " + getInsurancePayment() + " | Stepen riska : " + getDegreeOfRisk() + " | Wes : " + getWeight() + "\n";
        else if (String.valueOf(View.bundle.getLocale().getLanguage()).equals("eu"))
            return getInsuranceCompany().toString() + " | Compensation : " + getCompensation() + " | Insurance Payment : " + getInsurancePayment() + " | Degree Of Risk : " + getDegreeOfRisk() + " | Weight : " + getWeight() + "\n";
        throw new RuntimeException();
    }

    public InsuranceObligationmMovableEstate(InsuranceCompany insuranceCompany, long compensation, long insurancePayment, double degreeOfRisk, double weight) {
        super(insuranceCompany, compensation, insurancePayment, degreeOfRisk);
        this.weight = weight;
        objectType = InsuranceObjectType.MOVABLE_ESTATE;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}