package eu.senla.task16.methods;

import eu.senla.task16.order.Order;
import eu.senla.task16.product.Product;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import static eu.senla.task16.methods.Service.*;

public class MethodsForOrders {

    final static File FILE_ORDERS = new File("src/eu/senla/task16/files/orders.txt");

    //  Преобразует информацию из файла в список Заказов
    public static void getListOrdersFromFile(List<Product> productList, List<Order> orderList) {
        try (Scanner scanner2 = new Scanner(FILE_ORDERS)) {
            while (scanner2.hasNextLine()) {
                String[] str = scanner2.nextLine().split("/");
                Order order = new Order(getDate(str[0]));
                for (int i = 1; i < str.length; i++) {
                    for (Product prod : productList) {
                        if (prod.getId() == Integer.parseInt(str[i])) {
                            order.addProduct(prod); } } }
                orderList.add(order); }
        } catch (FileNotFoundException e) { e.printStackTrace(); } }


    // Преобразует List Заказов в файл
    public static void getFileFromOrdersList(List<Order> orderList) {
        try (Writer writer2 = new FileWriter(FILE_ORDERS)) {
            for (Order order : orderList) {
                String strOrd = order.getDateOfOrder().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                for (Product prod : order.getProductList()) {
                    strOrd = (strOrd + "/" + prod.getId()); }
                writer2.write(strOrd + "\n"); }
        } catch (IOException e) { e.printStackTrace(); } }


    // Удаляет заказ по id
    public static void deleteOrder(List<Order> orderList) {
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Введите id заказа который Вы хотите удалить: ");
        int id = scanner5.nextInt();
        Order orderTemp = null;
        for (Order ord : orderList) {
            if (ord.getId() == id) {
                orderTemp = ord;
                System.out.println("Заказ: " + ord.toString() + " удален!"); } }
        if (orderTemp == null) {
            System.out.println("Заказ с id " + id + " не найден!"); }
        orderList.remove(orderTemp);
        //scanner5.close(); // java.util.NoSuchElementException
    }

    // Создает заказ
    public static void createOrder(List<Product> productList, List<Order> orderList) {
        Order order = new Order(LocalDate.now());
        Product product = null;
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Сколько товаров Вы хотите добавить в заказ: ");
        int numberOfProducts = scanner6.nextInt();
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Введите id товара который вы хотите добавить: ");
            int id = scanner6.nextInt();
            for (Product prod : productList) {
                if (prod.getId() == id) {
                    product = prod;
                    order.getProductList().add(product); } }
            if (product == null) {
                System.out.println("Товар с id " + id + " не найден!");
                i--; } }
        orderList.add(order);
        System.out.println("Заказ №" + order.getId() + " от " + order.getDateOfOrder() + " создан!"); }

}
