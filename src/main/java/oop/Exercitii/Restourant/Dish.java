package oop.Exercitii.Restourant;

import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String name;
    private List <Ingredient> items;
    private Category category;

    public Dish(String name, Category category) {
        this.name = name;
        this.category = category;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return items;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.items = ingredients;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void addIngredients(Ingredient ingredient){
        items.add(ingredient);
    }
    public void removeIngredients(int id){
        if (!items.isEmpty()){
            items.remove(id);
        }
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", items=" + items +
                ", category=" + category +
                '}';
    }
}
