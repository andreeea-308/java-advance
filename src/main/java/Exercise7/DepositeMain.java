package Exercise7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DepositeMain {
    public static Deposite createDeposite(){
        Product product = new Product(1, "Calculator", 500.0, 3, LocalDate.of(2016, 3, 8));
        Product product1 = new Product(2, "Spray", 50.0, 6, LocalDate.of(2021, 9, 24));
        Product product2 = new Product(3, "Aspirator", 300.0, 5, LocalDate.of(2007, 12, 15));
        Product product3 = new Product(4, "Telefon", 200.0, 0, LocalDate.of(2007, 12, 15));

        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product1);
        products.add(product2);
        products.add(product3);

        return new Deposite(products);
    }
}
