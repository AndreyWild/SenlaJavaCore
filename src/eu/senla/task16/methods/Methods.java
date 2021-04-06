package eu.senla.task16.methods;

import eu.senla.task16.order.Order;
import eu.senla.task16.product.Product;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {

    static File fileProducts = new File("src/eu/senla/task16/files/products.txt");
    static File fileProducts2 = new File("src/eu/senla/task16/files/products2.txt");
    static File fileOrders = new File("src/eu/senla/task16/files/orders.txt");
    static File fileOrders2 = new File("src/eu/senla/task16/files/orders2.txt");


    public static void errorMessage(){
        System.out.println("Вы точно поняли что надо делать?");
    }


    // Преобразует String в LocalDate
    public static LocalDate getDate(String date) {
        String[] s = date.split("-");
        return LocalDate.of(Integer.parseInt(s[2]), Integer.parseInt(s[1]), Integer.parseInt(s[0]));
    }

    // Выводит любой список в консоль
    public static <T> void showList(List<T> productList) {
        for (T p : productList) {
            System.out.println(p);
        }
    }

    //  Преобразует информацию из файла в список Продуктов(товаров)
    public static void getListProductsFromFile(List<Product> productList) throws FileNotFoundException {
        //List<Product> productList = new ArrayList<>();
        //File fileP = new File("src/eu/senla/task16/files/products");

            Scanner scanner = new Scanner(fileProducts);
            while (scanner.hasNextLine()) {
                String num = scanner.nextLine();
                String[] str = num.split("/");
                LocalDate ld= getDate(str[1]);
                Product product = new Product(str[0], ld);
                productList.add(product);
            }
            scanner.close();
            //return productList;
    }

    //  Преобразует информацию из файла в список Заказов
    public static void getListOrdersFromFile(List<Product> productList, List<Order> orderList) throws FileNotFoundException {
        //List<Order> orderList = new ArrayList<>();
        Scanner scanner = new Scanner(fileOrders);
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
        scanner.close();
        //return orderList;
    }

    // Преобразует List Продуктов(товаров) в файл
    public static void getFileFromProductsList(List<Product>productList) throws IOException {
        Writer writer = new FileWriter(fileProducts2);
            for (Product product : productList) {
                String strProd = product.getName() + "/" + product.getDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                writer.write(strProd + "\n");
        }
        writer.close();
    }


    // Преобразует List Заказов в файл
    public static void getFileFromOrdersList(List<Order>orderList) throws IOException {
        Writer writer = new FileWriter(fileOrders2);
        List<Product> productList;
        StringBuilder stringBuilder = new StringBuilder();
        for(Order order : orderList){
            //stringBuilder.append(order.getDateOfOrder().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            String strOrd = order.getDateOfOrder().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            for(Product prod : order.getProductList()){
                strOrd = (strOrd + "/" + prod.getId());
                //stringBuilder.append("/" + prod.getId());
            }
            //writer.write(stringBuilder + "\n");
            writer.write(strOrd + "\n");
        }
        writer.close();
    }

    public static void createProduct(List<Product> productList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название товара: ");
        String name = scanner.next();
        System.out.print("Введите год производста в формате yyyy: ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц производста в формате MM: ");
        int month = scanner.nextInt();
        System.out.print("Введите число производста в формате dd: ");
        int day = scanner.nextInt();
        LocalDate ld = LocalDate.of(year,month,day);
        Product product = new Product(name, ld);
        productList.add(product);
        // scanner.close(); // java.util.NoSuchElementException
        System.out.println("Товар " + name + " от " + ld + " создан!");
    }

    public static void deleteProduct(List<Product> productList){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите id товара который Вы хотите удалить: ");
        int id = scanner.nextInt();
        Product prodTemp = null;
        for (Product prod : productList){
            if(prod.getId() == id){
                prodTemp = prod;
                System.out.println("Товар: " + prod.toString() + " удален!");
            }
        }
        if(prodTemp == null){
            System.out.println("Товар с id " + id + " не найден!");
        }
        productList.remove(prodTemp);
        // scanner.close(); // java.util.NoSuchElementException
    }

    public static void deleteOrder(List<Order> orderList){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите id заказа который Вы хотите удалить: ");
        int id = scanner.nextInt();
        Order orderTemp = null;
        for (Order ord : orderList){
            if(ord.getId() == id){
                orderTemp = ord;
                System.out.println("Заказ: " + ord.toString() + " удален!");
            }
        }
        if(orderTemp == null){
            System.out.println("Заказ с id " + id + " не найден!");
        }
        orderList.remove(orderTemp);
//        // scanner.close(); // java.util.NoSuchElementException
    }




}
