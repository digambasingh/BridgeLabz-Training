package com.bridgelabz.generics.personalizedmealgenerator;

class Meal<T extends MealPlan> {

    private final T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }
}

