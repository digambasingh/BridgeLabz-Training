package com.bridgelabz.generics.aidrivenresumescreeningsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Alice", 3, 80, new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Bob", 2, 85, new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Charlie", 5, 70, new ProductManager());

        System.out.println("Alice Selected: " + AIScreener.screenResume(r1));
        System.out.println("Bob Selected: " + AIScreener.screenResume(r2));
        System.out.println("Charlie Selected: " + AIScreener.screenResume(r3));

        // Screening pipeline
        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningPipeline.displayRoles(roles);
    }
}

