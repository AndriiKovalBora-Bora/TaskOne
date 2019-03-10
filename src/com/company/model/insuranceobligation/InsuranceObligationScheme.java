package com.company.model.insuranceobligation;

public abstract class InsuranceObligationScheme implements Comparable<InsuranceObligationScheme>{
    private InsuranceCompany insuranceCompany;
    private long compensation;
    private long insurancePayment;
    private double degreeOfRisk;

    public InsuranceObligationScheme() {
    }

    public InsuranceObligationScheme(InsuranceCompany insuranceCompany, long compensation, long insurancePayment, double degreeOfRisk) {
        this.insuranceCompany = insuranceCompany;
        this.compensation = compensation;
        this.insurancePayment = insurancePayment;
        this.degreeOfRisk = degreeOfRisk;
    }

    @Override
    public abstract String toString();

    @Override
    public int compareTo(InsuranceObligationScheme o) {
        if (getDegreeOfRisk() == o.getDegreeOfRisk())
            return 0;
        else if (getDegreeOfRisk() < o.getDegreeOfRisk())
            return 1;
        else if (getDegreeOfRisk() > o.getDegreeOfRisk())
            return -1;
        throw new RuntimeException("Not compared");
    }

    public InsuranceCompany getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(InsuranceCompany insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public long getCompensation() {
        return compensation;
    }

    public void setCompensation(long compensation) {
        this.compensation = compensation;
    }

    public long getInsurancePayment() {
        return insurancePayment;
    }

    public void setInsurancePayment(long insurancePayment) {
        this.insurancePayment = insurancePayment;
    }

    public double getDegreeOfRisk() {
        return degreeOfRisk;
    }

    public void setDegreeOfRisk(double degreeOfRisk) {
        this.degreeOfRisk = degreeOfRisk;
    }
}
