package com.company.controller;

import com.company.model.Model;
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
import com.company.view.View;
import com.company.view.ViewPrompts;

import java.sql.SQLOutput;
import java.util.Optional;
import java.util.Scanner;

import static com.company.view.ViewPrompts.*;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        createDelrivative();
        calculatePrice();
        sort();
        filter();
    }

    public void filter(){
        view.printMessage(View.bundle.getString(ENTER_PAYMENT_FROM));
        long pf;
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            view.printMessage(View.bundle.getString(WRONG_INPUT_NUMBER));
        }
        pf = sc.nextInt();

        view.printMessage(View.bundle.getString(ENTER_PAYMENT_TO));
        long pt;
        while (!sc.hasNextInt()) {
            view.printMessage(View.bundle.getString(WRONG_INPUT_NUMBER));
        }
        pt = sc.nextInt();

        view.printMessage(View.bundle.getString(ENTER_COMPENSATION_FROM));
        long cf;
        while (!sc.hasNextInt()) {
            view.printMessage(View.bundle.getString(WRONG_INPUT_NUMBER));
        }
        cf = sc.nextInt();

        view.printMessage(View.bundle.getString(ENTER_COMPENSATION_TO));
        long ct;
        while (!sc.hasNextInt()) {
            view.printMessage(View.bundle.getString(WRONG_INPUT_NUMBER));
        }
        ct = sc.nextInt();


        view.printMessage(View.bundle.getString(YOUR_REQUEST));
        model.filter(pf,pt,cf,ct).forEach(System.out::print);

    }

    public void sort(){
        view.printMessage(View.bundle.getString(SORTED_BY_INCREASING_RISK));
        model.sort().forEach(System.out::print);
    }

    public void calculatePrice() {
        view.printMessage(View.bundle.getString(TOTAL_PAYMENT), String.valueOf(model.calculatePrice()));
    }

    public void createDelrivative() {
        model.createDelrivative();
        view.printMessage(View.bundle.getString(OUR_DERIVATIVE));
        model.getDerivativeOfInsuranceObligationsScheme().forEach(System.out::print);
    }


}
