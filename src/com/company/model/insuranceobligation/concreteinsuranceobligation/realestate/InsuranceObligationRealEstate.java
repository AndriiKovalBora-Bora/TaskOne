package com.company.model.insuranceobligation.concreteinsuranceobligation.realestate;

import com.company.model.insuranceobligation.CompensationCalculation;
import com.company.model.insuranceobligation.InsuranceCompany;
import com.company.model.insuranceobligation.InsuranceObligationScheme;
import com.company.model.insuranceobligation.insuranceobject.InsuranceObjectType;
import com.company.view.View;

public class InsuranceObligationRealEstate extends InsuranceObligationScheme implements CompensationCalculation {

    InsuranceObjectType objectType;
    double square;

    public InsuranceObligationRealEstate() {
        objectType = InsuranceObjectType.REAL_ESTATE;
    }

    @Override
    public String toString() {
        if (String.valueOf(View.bundle.getLocale().getLanguage()).equals("eu_ua"))
            return getInsuranceCompany().toString() + " | Compensasua : " + getCompensation() + " | Plata : " + getInsurancePayment() + " | Stepen riska : " + getDegreeOfRisk() + " | Ploshad : " + getSquare() + "\n";
        else if (String.valueOf(View.bundle.getLocale().getLanguage()).equals("eu"))
            return getInsuranceCompany().toString() + " | Compensation : " + getCompensation() + " | Insurance Payment : " + getInsurancePayment() + " | Degree Of Risk : " + getDegreeOfRisk() + " | Square : " + getSquare() + "\n";
        throw new RuntimeException();
    }

    public InsuranceObligationRealEstate(InsuranceCompany insuranceCompany, long compensation, long insurancePayment, double degreeOfRisk, double square) {
        super(insuranceCompany, compensation, insurancePayment, degreeOfRisk);
        this.square = square;
        objectType = InsuranceObjectType.REAL_ESTATE;
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

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

}
