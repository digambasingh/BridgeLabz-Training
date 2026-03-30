package com.bridgelabz.generics.personalizedmealgenerator;

class MealPlanGenerator {

    // Generic method with bounded type parameter
    public static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {

        // Simple validation logic
        if (plan.getCalories() <= 0) {
            throw new IllegalArgumentException("Invalid meal plan");
        }

        return new Meal<>(plan);
    }
}

