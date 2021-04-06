package eu.senla.task16.order;

import eu.senla.task16.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int id;
    private LocalDate dateOfOrder;
    private List<Product> productList = new ArrayList<>();
    private static int counter = 0;

    public Order(LocalDate ld) {
        counter++;
        id = counter;
        this.dateOfOrder = ld;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Order:" +
                "id=" + id +
                ", Date of Order:" + dateOfOrder +
                ", productList: \n" + productList.toString();
    }
}
