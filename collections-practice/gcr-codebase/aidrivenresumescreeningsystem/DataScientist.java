package com.bridgelabz.generics.aidrivenresumescreeningsystem;

class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public boolean isQualified(int experience, int skillScore) {
        return experience >= 3 && skillScore >= 75;
    }
}

