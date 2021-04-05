package eu.senla.task16.main;


import eu.senla.task16.order.Order;
import eu.senla.task16.product.Product;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static eu.senla.task16.methods.Methods.*;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        List<Order> orderList = new ArrayList<>();
        Scanner scanner;
        File fileP = new File("src/eu/senla/task16/files/products");
        File fileO = new File("src/eu/senla/task16/files/orders");
        String num;

        try{
            /* Создает список продуктов на основе файла products */
            productList = getListProductsFromFile(fileP);

//            scanner = new Scanner(fileP);
//            while (scanner.hasNextLine()){
//                num = scanner.nextLine();
//                String[] str = num.split("/");
//                Product product = new Product(str[0], getDate(str[1]));
//                productList.add(product);
//            }

            /* Создает список товаров на основе файла orders */
           orderList = getListOrdersFromFile(productList, fileO);

//            scanner = new Scanner(fileO);
//            while (scanner.hasNextLine()){
//                num = scanner.nextLine();
//                String[] str = num.split("/");
//                Order order = new Order(getDate(str[0]));
//                for (int i = 1; i <str.length ; i++) {
//                    for (Product prod : productList){
//                        if(prod.getId() == Integer.parseInt(str[i])){
//                            order.addProduct(prod);
//                        }
//                    }
//                }
//                orderList.add(order);
//            }

        } catch (Exception ex){ ex.printStackTrace(); }

        try {
            while (true){
                scanner = new Scanner(System.in);
                System.out.println("С чем Вы хотете работать? 1 - товар, 2 - заказ, 3 - выход: ");
                String num3 = scanner.next();

                /* Выход */
                if("3".equals(num3)){break;}

                /* Работа с товарами */
                if("1".equals(num3)){
                    while (true){
                        System.out.println("Что делать с товарами?");
                        System.out.println("1 - посмотреть все товары, 2 - выход");
                        String num4 = scanner.next();
                        if("2".equals(num4)){break;}
                        if("1".equals(num4)){showList(productList);}
                    }
                }

                /* Работа с заказами */
                if("2".equals(num3)){
                    while (true){
                        System.out.println("Что делать с заказами?");
                        System.out.println("1 - посмотреть все заказы, 2 - выход");
                        String num5 = scanner.next();
                        if("2".equals(num5)){break;}
                        if("1".equals(num5)){showList(orderList);}
                    }
                }
            }
        } catch (Exception ex){ex.printStackTrace();}








    }
}
