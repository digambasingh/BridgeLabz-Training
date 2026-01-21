package com.bridgelabz.generics.aidrivenresumescreeningsystem;

import java.util.List;

class ScreeningPipeline {

    // Wildcard method to process multiple job roles
    public static void displayRoles(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening role: " + role.getRoleName());
        }
    }
}

