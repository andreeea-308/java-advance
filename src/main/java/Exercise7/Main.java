package Exercise7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Deposite deposite = DepositeMain.createDeposite();

        /*METHOD 1*/
        System.out.println(deposite.getSize());

        /*METHOD 2*/
        Optional<Product> optionalProduct = deposite.getProductID(2);
        if (optionalProduct.isPresent()) {
            System.out.println(optionalProduct.get());
        } else {
            System.out.println("Product not found!");
        }
        Optional<Product> optionalProduct1 = deposite.getProductID(5);
        if (optionalProduct1.isPresent()) {
            System.out.println(optionalProduct1.get());
        } else {
            System.out.println("Product not found!");
        }

        /*METHOD 3*/
        Optional<Product> optionalProduct2 = deposite.getProductName("Spray");
        if (optionalProduct2.isPresent()) {
            System.out.println(optionalProduct2.get());
        } else {
            System.out.println("Product not found!");
        }
        Optional<Product> optionalProduct3 = deposite.getProductName("Dalin");
        if (optionalProduct3.isPresent()) {
            System.out.println(optionalProduct3.get());
        } else {
            System.out.println("Product not found!");
        }

        /*METHOD 4*/
        System.out.println(deposite.getOutOfStockProducts());

        /*METHOD 5*/


        /*METHOD 6*/
        System.out.println(deposite.getProductsName());

        /*METHOD 7*/
        System.out.println(deposite.getProductsReceivedBefore(LocalDate.of(2015, 9, 7)));

        /*METHOD 8*/
        System.out.println(deposite.getPrices());
        System.out.println(deposite.getPricesUsingStreams());

    }
}
