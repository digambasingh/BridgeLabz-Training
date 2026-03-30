package com.bridgelabz.generics.aidrivenresumescreeningsystem;

abstract class JobRole {

    private final String roleName;

    protected JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    // Each role has its own evaluation logic
    public abstract boolean isQualified(int experience, int skillScore);
}
