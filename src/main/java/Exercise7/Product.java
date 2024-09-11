package Exercise7;

import java.time.LocalDate;

/*
1.Create a class Product with fields: id, name, price, quantity, receptionDate.
2.Create a class Deposit with following features:
contains a field representing a list of products
* has method getSize() that returns number of elements in deposit
* has method getProductById() that takes an int as input the returns the product with id equal with input value
* has method getProductByName() that takes a String as input the returns the product with name equal with input value
* has method getOutOfStockProducts() that returns a list of products with quantity 0
* has a method decreseQuantity() that decrease product quantity. This method takes as parameters product id and quantity to decrease.
* has a method getProductsName() that returns name of all products in deposit
* has a method getProductsReceivedBefore() that takes as parameter a specific date,
and returns a list with all products with receptionDate before that parameter
* has a method getPrices() that returns a map containing pairs (id, price)
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private LocalDate receptionDate;
    public int numberOfElements;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity, LocalDate receptionDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.receptionDate = receptionDate;
        numberOfElements++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getReceptionDate() {
        return receptionDate;
    }

    public void setReceptionDate(LocalDate receptionDate) {
        this.receptionDate = receptionDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", receptionDate=" + receptionDate +
                '}';
    }

    public boolean isOutOfStock() {
        if (this.quantity == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int decreaseQuantity(int numberOfDecrese) {
        if (quantity >= numberOfDecrese) {
            throw new RuntimeException("Decrese quantity fai is bigger than quantity of product");
        }
        return this.quantity = this.quantity - numberOfDecrese;
    }

    public boolean isReceptionDateBefore(LocalDate localDate){
        return this.receptionDate.isBefore(localDate);
    }
}
