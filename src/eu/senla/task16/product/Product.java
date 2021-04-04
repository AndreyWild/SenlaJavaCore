package eu.senla.task16.product;

import java.time.LocalDate;

public class Product {

    private int id;
    private String name;
    private LocalDate date;
    private static int counter = 0;

    public Product() {
    }

    public Product(String name, LocalDate date) {
        counter++;
        id = counter;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id:" + id +
                ", name:" + name +
                ", Manufacturing date:" + date +
                '}';
    }
}
