package oop.Exercitii.Restourant;

public class Category {
    private Categorys type;

    public Category(Categorys type) {
        this.type = type;
    }

    public Categorys getType() {
        return type;
    }

    public void setType(Categorys type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Category{" +
                "type=" + type +
                '}';
    }
}
