package com.company.model.insuranceobligation;

import com.company.view.View;

public class InsuranceCompany {
    private String name;
    private String address;

    public InsuranceCompany(String name, String adress) {
        this.name = name;
        this.address = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        if (String.valueOf(View.bundle.getLocale().getLanguage()).equals("eu_ua"))
            return "Ima : " + getName() + " | Adres : " + getAddress();
        else if (String.valueOf(View.bundle.getLocale().getLanguage()).equals("eu"))
            return "Name : " + getName() + " | Address : " + getAddress();
        throw new RuntimeException();
    }
}
