package com.bridgelabz.generics.aidrivenresumescreeningsystem;

class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public boolean isQualified(int experience, int skillScore) {
        return experience >= 2 && skillScore >= 70;
    }
}

