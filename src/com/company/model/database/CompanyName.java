package com.company.model.database;

public enum CompanyName {
    COMPANY_HEALTHY_PEOPLE("Healthy People"),
    COMPANY_BE_ALIVE("Be Alive"),
    COMPANY_SAVE_YOUR_PROPERTY("Save Your Property"),
    COMPANY_SAVE_GOODS("Save Goods");

    private String companyName;

    CompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
