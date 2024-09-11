package oop.Exercitii.Restourant;
/*
Exercise 2: Composition
Implement a restaurant management system where dishes are composed of ingredients and have categories (appetizers, main courses, desserts).
Create classes for Dish, Ingredient, and Category. Use composition to model the relationship between Dish and Ingredient,
and between Dish and Category. The Dish class should have methods to add and remove ingredients and categories.
 */
public class Main {
    public static void main(String[] args) {
        Dish dish = new Dish("Tiramisu", new Category(Categorys.DESSERTS));
        dish.addIngredients(new Ingredient("sugar", 0.3));
        dish.addIngredients(new Ingredient("water", 1.0));
        System.out.println(dish);
        dish.removeIngredients(1);
        System.out.println(dish);
    }
}
