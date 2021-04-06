package eu.senla.task16.methods;

import eu.senla.task16.order.Order;
import eu.senla.task16.product.Product;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Methods {

    final static File FILE_PRODUCTS = new File("src/eu/senla/task16/files/products.txt");
    final static File FILE_ORDERS = new File("src/eu/senla/task16/files/orders.txt");

    public static void errorMessage() { System.out.println("Вы точно поняли что надо делать?"); }

    // Преобразует String в LocalDate
    public static LocalDate getDate(String date) {
        String[] s = date.split("-");
        return LocalDate.of(Integer.parseInt(s[2]), Integer.parseInt(s[1]), Integer.parseInt(s[0])); }

    // Выводит любой список в консоль
    public static <T> void showList(List<T> productList) {
        for (T p : productList) { System.out.println(p); } }

    //  Преобразует информацию из файла в список Продуктов(товаров)
    public static void getListProductsFromFile(List<Product> productList) {
        try (Scanner scanner1 = new Scanner(FILE_PRODUCTS)) {
            while (scanner1.hasNextLine()) {
                String[] str = scanner1.nextLine().split("/");
                productList.add(new Product(str[0], getDate(str[1]))); }
        } catch (FileNotFoundException e) { e.printStackTrace(); } }

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

    // Преобразует List Продуктов(товаров) в файл
    public static void getFileFromProductsList(List<Product> productList) {
        try (Writer writer1 = new FileWriter(FILE_PRODUCTS)) {
            for (Product product : productList) {
                String strProd = product.getName() + "/" + product.getDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                writer1.write(strProd + "\n"); }
        } catch (IOException e) { e.printStackTrace(); } }

    // Преобразует List Заказов в файл
    public static void getFileFromOrdersList(List<Order> orderList) {
        try (Writer writer2 = new FileWriter(FILE_ORDERS)) {
            for (Order order : orderList) {
                String strOrd = order.getDateOfOrder().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                for (Product prod : order.getProductList()) {
                    strOrd = (strOrd + "/" + prod.getId()); }
                writer2.write(strOrd + "\n"); }
        } catch (IOException e) { e.printStackTrace(); } }

    public static void createProduct(List<Product> productList) {
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Введите название товара: ");
        String name = scanner3.next();
        System.out.print("Введите год производста в формате yyyy: ");
        int year = scanner3.nextInt();
        System.out.print("Введите месяц производста в формате MM: ");
        int month = scanner3.nextInt();
        System.out.print("Введите число производста в формате dd: ");
        int day = scanner3.nextInt();
        LocalDate ld = LocalDate.of(year, month, day);
        Product product = new Product(name, ld);
        productList.add(product);
        //scanner3.close(); // java.util.NoSuchElementException
        System.out.println("Товар " + name + " от " + ld + " создан!");
    }

    public static void deleteProduct(List<Product> productList) {
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Введите id товара который Вы хотите удалить: ");
        int id = scanner4.nextInt();
        Product prodTemp = null;
        for (Product prod : productList) {
            if (prod.getId() == id) {
                prodTemp = prod;
                System.out.println("Товар: " + prod.toString() + " удален!");
            }
        }
        if (prodTemp == null) {
            System.out.println("Товар с id " + id + " не найден!");
        }
        productList.remove(prodTemp);
        //scanner4.close();
    }

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
