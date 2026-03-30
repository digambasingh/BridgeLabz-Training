package com.bridgelabz.generics.personalizedmealgenerator;

public class Main {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                MealPlanGenerator.generateMealPlan(new VegetarianMeal());

        Meal<KetoMeal> ketoMeal =
                MealPlanGenerator.generateMealPlan(new KetoMeal());

        printMeal(vegMeal);
        printMeal(ketoMeal);
    }

    private static void printMeal(Meal<? extends MealPlan> meal) {
        System.out.println(
            meal.getMealPlan().getMealType() +
            " Meal | Calories: " +
            meal.getMealPlan().getCalories()
        );
    }
}

