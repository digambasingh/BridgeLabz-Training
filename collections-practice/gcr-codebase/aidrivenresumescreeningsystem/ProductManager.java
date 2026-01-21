package com.bridgelabz.generics.aidrivenresumescreeningsystem;

class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public boolean isQualified(int experience, int skillScore) {
        return experience >= 4 && skillScore >= 65;
    }
}
