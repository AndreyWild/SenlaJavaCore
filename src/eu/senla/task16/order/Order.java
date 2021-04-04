package eu.senla.task16.order;

import eu.senla.task16.product.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int id;
    private LocalDateTime dateOfOrder;
    List<Product> productList = new ArrayList<>();
    private static int counter = 0;

    public Order() {
        counter++;
        id = counter;
        dateOfOrder = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateOfOrder=" + dateOfOrder.format(DateTimeFormatter.ofPattern("dd.MMM.Y hh:mm")) +
                ", productList= \n" + productList.toString()
                +
                '}';
    }
}
