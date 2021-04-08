package eu.senla.task16.methods;

import eu.senla.task16.order.Order;
import eu.senla.task16.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static eu.senla.task16.methods.MethodsForProducts.*;
import static eu.senla.task16.methods.MethodsForOrders.*;
import static eu.senla.task16.methods.Service.*;

public class Logic {

    public static void start() {

        try (Scanner scannerMain = new Scanner(System.in)) {
            List<Product> productList = new ArrayList<>();
            List<Order> orderList = new ArrayList<>();

            /* Создает список продуктов на основе файла products */
            getListProductsFromFile(productList);

            /* Создает список товаров на основе файла orders */
            getListOrdersFromFile(productList, orderList);

            while (true) {
                System.out.println("С чем Вы хотете работать? 1 - товар, 2 - заказ, 0 - выход: ");
                String mainMenu = scannerMain.next();

                /* Выход */
                if ("0".equals(mainMenu)) { break; }

                /* Работа с товарами */
                else if ("1".equals(mainMenu)) {

                    while (true) {
                        System.out.println("Что делать с товарами?");
                        System.out.println("1 - посмотреть все товары, 2 - добавить товар, 3 - удалть товар, 0 - выход: ");
                        String productsMenu = scannerMain.next();

                        if ("0".equals(productsMenu)) { break;
                        } else if ("1".equals(productsMenu)) {
                            showList(productList);
                        } else if ("2".equals(productsMenu)) {
                            createProduct(productList);
                            getFileFromProductsList(productList);
                        } else if ("3".equals(productsMenu)) {
                            deleteProduct(productList);
                            getFileFromProductsList(productList);
                        } else {
                            errorMessage();
                        }
                    }
                }

                /* Работа с заказами */
                else if ("2".equals(mainMenu)) {

                    while (true) {
                        System.out.println("Что делать с заказами?");
                        System.out.println("1 - посмотреть все заказы, 2 - добавить заказ, 3 - удалить заказ, 0 - выход: ");
                        String ordersMenu = scannerMain.next();

                        if ("0".equals(ordersMenu)) { break;
                        } else if ("1".equals(ordersMenu)) {
                            showList(orderList);
                        } else if ("2".equals(ordersMenu)) {
                            createOrder(productList, orderList);
                            getFileFromOrdersList(orderList);
                        } else if ("3".equals(ordersMenu)) {
                            deleteOrder(orderList);
                            getFileFromOrdersList(orderList);
                        } else { errorMessage(); }
                    }
                } else { errorMessage(); }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
