package eu.senla.task16.main;


import eu.senla.task16.product.Product;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        try{
            File file = new File("src/eu/senla/task16/files/products");
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()){
                String s = scan.nextLine();
                String[] str = s.split("/");
                Product product = new Product(str[0], getDate(str[1]));
                productList.add(product);
            }

        } catch (Exception ex){ ex.printStackTrace(); }

        try {
            while (true){
                Scanner scan = new Scanner(System.in);
                System.out.println("С чем Вы хотете работать? 1 - товар, 2 - заказ, 3 - выход: ");
                String num = scan.next();
                if("3".equals(num)){break;}

                if("1".equals(num)){
                    while (true){
                        System.out.println("Что делать с товарами?");
                        System.out.println("1 - посмотреть все товары, 2 - выход");
                        String num2 = scan.next();
                        if("2".equals(num2)){break;}

                        if("1".equals(num2)){showProductList(productList);}
                    }


                }







            }

        } catch (Exception ex){ex.printStackTrace();}








    }

    public static LocalDate getDate(String date){
        String[] s = date.split("-");
        return LocalDate.of(Integer.parseInt(s[2]), Integer.parseInt(s[1]),Integer.parseInt(s[0]));
    }

    public static void showProductList(List<Product> productList){
        for (Product p : productList){
            System.out.println(p);
        }
    }




}
