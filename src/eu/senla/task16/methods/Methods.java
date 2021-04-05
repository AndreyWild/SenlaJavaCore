package eu.senla.task16.methods;

import eu.senla.task16.order.Order;
import eu.senla.task16.product.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {

    // Преобразует String в  LocalDate
    public static LocalDate getDate(String date) {
        String[] s = date.split("-");
        return LocalDate.of(Integer.parseInt(s[2]), Integer.parseInt(s[1]), Integer.parseInt(s[0]));
    }

    public static <T> void showList(List<T> productList) {
        for (T p : productList) {
            System.out.println(p);
        }
    }


    public static List<Product> getListProductsFromFile(File file) throws FileNotFoundException {
        List<Product> productList = new ArrayList<>();
        //File fileP = new File("src/eu/senla/task16/files/products");

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String num = scanner.nextLine();
                String[] str = num.split("/");
                LocalDate ld= getDate(str[1]);
                Product product = new Product(str[0], ld);
                productList.add(product);
            }
            return productList;
    }

    public static List<Order> getListOrdersFromFile(List<Product> productList, File file) throws FileNotFoundException {
        List<Order> orderList = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String num = scanner.nextLine();
            String[] str = num.split("/");
            Order order = new Order(getDate(str[0]));
            for (int i = 1; i < str.length; i++) {
                for (Product prod : productList) {
                    if (prod.getId() == Integer.parseInt(str[i])) {
                        order.addProduct(prod);
                    }
                }
            }
            orderList.add(order);
        }
        return orderList;
    }


}
