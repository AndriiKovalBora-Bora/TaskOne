package com.company.model;

import com.company.model.database.CompanyName;
import com.company.model.database.IllnessName;
import com.company.model.insuranceobligation.CompensationCalculation;
import com.company.model.insuranceobligation.InsuranceCompany;
import com.company.model.insuranceobligation.InsuranceObligationMaker;
import com.company.model.insuranceobligation.InsuranceObligationScheme;
import com.company.model.insuranceobligation.concreteinsuranceobligation.health.InsuranceObligationHealthMaker;
import com.company.model.insuranceobligation.concreteinsuranceobligation.life.InsuranceObligationLifeMaker;
import com.company.model.insuranceobligation.concreteinsuranceobligation.movableestate.InsuranceObligationmMovableEstateMaker;
import com.company.model.insuranceobligation.concreteinsuranceobligation.realestate.InsuranceObligationRealEstateMaker;
import com.company.view.ViewPrompts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Model {
    private List<CompensationCalculation> derivativeOfInsuranceObligations = new ArrayList<>();

    public List<CompensationCalculation> getDerivativeOfInsuranceObligations() {
        return derivativeOfInsuranceObligations;
    }

    public void setDerivativeOfInsuranceObligations(ArrayList<CompensationCalculation> derivativeOfInsuranceObligations) {
        this.derivativeOfInsuranceObligations = derivativeOfInsuranceObligations;
    }


    public void createDelrivative() {

        InsuranceObligationMaker maker = new InsuranceObligationHealthMaker();
        CompensationCalculation healthObligation1 = maker.createInsuranceObligation(new InsuranceCompany(CompanyName.COMPANY_BE_ALIVE.getCompanyName(), "Street 1"), 300, 10, 0.1, IllnessName.ILLNESS_NAME_COLD.getIllnessName());
        getDerivativeOfInsuranceObligations().add(healthObligation1);

        CompensationCalculation healthObligation2 = maker.createInsuranceObligation(new InsuranceCompany(CompanyName.COMPANY_HEALTHY_PEOPLE.getCompanyName(), "Street 1"), 270, 5, 0.3, IllnessName.ILLNESS_NAME_HEART_ATTRACK.getIllnessName());
        getDerivativeOfInsuranceObligations().add(healthObligation2);

        maker = new InsuranceObligationLifeMaker();
        CompensationCalculation lifeObligation1 = maker.createInsuranceObligation(new InsuranceCompany(CompanyName.COMPANY_BE_ALIVE.getCompanyName(), "Street10"), 400, 12, 0.1, "Car Accident");
        getDerivativeOfInsuranceObligations().add(lifeObligation1);

        maker = new InsuranceObligationmMovableEstateMaker();
        CompensationCalculation movableEstateObligation1 = maker.createInsuranceObligation(new InsuranceCompany(CompanyName.COMPANY_SAVE_GOODS.getCompanyName(), "Street 9"), 50, 1, 0.4, "2");
        getDerivativeOfInsuranceObligations().add(movableEstateObligation1);

        maker = new InsuranceObligationRealEstateMaker();
        CompensationCalculation realEstateObligation = maker.createInsuranceObligation(new InsuranceCompany(CompanyName.COMPANY_SAVE_YOUR_PROPERTY.getCompanyName(), "Street 11"), 1000, 30, 0.1, "500");
        getDerivativeOfInsuranceObligations().add(realEstateObligation);
    }

    public long calculatePrice() {
        return getDerivativeOfInsuranceObligations().stream()
                .map(x -> (x.calculateInsurancePayment(1)))
                .reduce((acc, x) -> acc + x)
                .get();
    }

    public List<InsuranceObligationScheme> sort() {
        return getDerivativeOfInsuranceObligations().stream()
                .map(x -> (InsuranceObligationScheme) x)
                .sorted().collect(Collectors.toList());
    }

    public List<InsuranceObligationScheme> filter(long pf, long pt, long cf, long ct) {
        return getDerivativeOfInsuranceObligations().stream()
                .map(x -> (InsuranceObligationScheme) x)
                .filter((x -> (x.getInsurancePayment() >= pf) && (x.getInsurancePayment() <= pt) && (x.getCompensation() >= cf) && (x.getCompensation() <= ct)))
                .collect(Collectors.toList());
    }

    public List<InsuranceObligationScheme> getDerivativeOfInsuranceObligationsScheme() {
        return getDerivativeOfInsuranceObligations().stream()
                .map(x -> (InsuranceObligationScheme) x)
                .collect(Collectors.toList());
    }

}
