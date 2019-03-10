package com.company;

import com.company.model.Model;
import com.company.model.database.CompanyName;
import com.company.model.database.IllnessName;
import com.company.model.insuranceobligation.CompensationCalculation;
import com.company.model.insuranceobligation.InsuranceCompany;
import com.company.model.insuranceobligation.InsuranceObligationMaker;
import com.company.model.insuranceobligation.concreteinsuranceobligation.health.InsuranceObligationHealth;
import com.company.model.insuranceobligation.concreteinsuranceobligation.health.InsuranceObligationHealthMaker;
import com.company.model.insuranceobligation.concreteinsuranceobligation.life.InsuranceObligationLifeMaker;
import com.company.model.insuranceobligation.concreteinsuranceobligation.movableestate.InsuranceObligationmMovableEstate;
import com.company.model.insuranceobligation.concreteinsuranceobligation.movableestate.InsuranceObligationmMovableEstateMaker;
import com.company.model.insuranceobligation.concreteinsuranceobligation.realestate.InsuranceObligationRealEstateMaker;
import com.company.view.View;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ModelTest {

    private static Model model;
    private static View view;


    @BeforeClass
    public static void init() {
        model = new Model();
        view = new View();
        model.createDelrivative();
    }

    @Test
    public void testModelCalcultePrice(){
        Assert.assertEquals(model.calculatePrice(),58);
    }

    @Test
    public void test1ModelCalcultePrice(){
        Assert.assertNotEquals(model.calculatePrice(),60);
    }


    @Test
    public void test2ModelCalculatePrice(){
        Assert.assertNotNull(model);
    }
}