package eu.senla.task16.methods;

import eu.senla.task16.product.Product;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import static eu.senla.task16.methods.Service.*;


public class MethodsForProducts {

    final static File FILE_PRODUCTS = new File("src/eu/senla/task16/files/products.txt");

    //  Преобразует информацию из файла в список Товаров
    public static void getListProductsFromFile(List<Product> productList) {
        try (Scanner scanner1 = new Scanner(FILE_PRODUCTS)) {
            while (scanner1.hasNextLine()) {
                String[] str = scanner1.nextLine().split("/");
                productList.add(new Product(str[0], getDate(str[1]))); }
        } catch (FileNotFoundException e) { e.printStackTrace(); } }


    // Преобразует List Товаров в файл
    public static void getFileFromProductsList(List<Product> productList) {
        try (Writer writer1 = new FileWriter(FILE_PRODUCTS)) {
            for (Product product : productList) {
                String strProd = product.getName() + "/" + product.getDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                writer1.write(strProd + "\n"); }
        } catch (IOException e) { e.printStackTrace(); } }


    // Создает Товар и добавляет его
    public static void createProduct(List<Product> productList) {
        try{
            Scanner scanner3 = new Scanner(System.in);
            System.out.print("Введите название товара: ");
            String name = scanner3.next();
            System.out.print("Введите год производста в формате yyyy: ");
            int year = scanner3.nextInt();
            if (year > 2021 || year < 1990){ throw new InputMismatchException(); }
            System.out.print("Введите месяц производста в формате MM: ");
            int month = scanner3.nextInt();
            if(month >12 || month < 1){ throw new InputMismatchException(); }
            System.out.print("Введите число производста в формате dd: ");
            int day = scanner3.nextInt();
            if(day > 31 || day < 1){ throw new InputMismatchException(); } // можно добавить проверку на кол-во дней в месяце

            LocalDate ld = LocalDate.of(year, month, day);
            Product product = new Product(name, ld);
            productList.add(product);
            //scanner3.close(); // java.util.NoSuchElementException
            System.out.println("Товар " + name + " от " + ld + " создан!");}
        catch (InputMismatchException | DateTimeException ex){
            System.err.println("Ты явно что-то делаешь не так, попробуй еще раз.");
        }
    }

    // Удаляет Товар по id
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





}
