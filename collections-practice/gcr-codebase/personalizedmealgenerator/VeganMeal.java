package com.bridgelabz.generics.personalizedmealgenerator;

class VeganMeal implements MealPlan {

    public String getMealType() {
        return "Vegan";
    }

    public int getCalories() {
        return 1600;
    }
}

