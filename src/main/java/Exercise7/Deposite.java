package Exercise7;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

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
public class Deposite {
    private List<Product> productList = new ArrayList<>();

    public Deposite(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Deposite{" +
                "productList=" + productList +
                '}';
    }

    /*METHODS*/
    public int getSize() {
        return productList.size();
    }

    public Optional<Product> getProductID(int id) {
        return productList.stream()
                .filter(product -> product.getId() == id)
                .findAny();
    }

    public Optional<Product> getProductName(String name) {
        return productList.stream()
                .filter(product -> product.getName().equals(name))
                .findAny();
    }

    public List<Product> getOutOfStockProducts() {
        return productList.stream()
                .filter(Product::isOutOfStock)
                .toList();
    }

    public void decreseQuantity(int id, int quantityOfDecrese) {
        getProductID(id)
                .ifPresentOrElse(product -> product.decreaseQuantity(quantityOfDecrese),
                        () -> {
                            throw new RuntimeException("Product not found");
                        }
                );
    }

    public List<String> getProductsName() {
        return productList.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public List<Product> getProductsReceivedBefore(LocalDate localDate){
        return productList.stream()
                .filter(product -> product.isReceptionDateBefore(localDate))
                .collect(Collectors.toList());
    }

    public Map<Integer, Double> getPrices() {
        Map<Integer, Double> mapPrices = new HashMap<>();
        productList.forEach(it -> mapPrices.put(it.getId(), it.getPrice()));
        return mapPrices;
    }

    public Map<Integer, Double> getPricesUsingStreams() {
        return productList.stream()
                .collect(Collectors.toMap(Product::getId, Product::getPrice));
    }
}
