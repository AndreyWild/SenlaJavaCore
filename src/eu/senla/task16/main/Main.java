package eu.senla.task16.main;


import eu.senla.task16.order.Order;
import eu.senla.task16.product.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static eu.senla.task16.methods.Methods.*;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        List<Order> orderList = new ArrayList<>();
        Scanner scannerMain = null;

        try {

            /* Создает список продуктов на основе файла products */
             getListProductsFromFile(productList);

            /* Создает список товаров на основе файла orders */
             getListOrdersFromFile( productList, orderList);

            while (true){
                scannerMain = new Scanner(System.in);
                System.out.println("С чем Вы хотете работать? 1 - товар, 2 - заказ, 0 - выход: ");
                String mainMenu = scannerMain.next();

                /* Выход */
                if("0".equals(mainMenu)){break;}

                /* Работа с товарами */
                else if("1".equals(mainMenu)){
                    while (true){
                        System.out.println("Что делать с товарами?");
                        System.out.println("1 - посмотреть все товары, 2 - добавить товар, 3 - удалть товар, 0 - выход: ");
                        String productsMenu = scannerMain.next();
                        if("0".equals(productsMenu)){break;}
                        else if("1".equals(productsMenu)){showList(productList);}
                        else if("2".equals(productsMenu)){
                            createProduct(productList);
                            getFileFromProductsList(productList);
                        }
                        else if("3".equals(productsMenu)){
                            deleteProduct(productList);
                            getFileFromProductsList(productList);
                        }
                        else { errorMessage();}
                    }
                }

                /* Работа с заказами */
                else if("2".equals(mainMenu)){
                    while (true){
                        System.out.println("Что делать с заказами?");
                        System.out.println("1 - посмотреть все заказы, 3 - удалить заказ, 0 - выход: ");
                        String ordersMenu = scannerMain.next();
                        if("0".equals(ordersMenu)){break;}
                        else if("1".equals(ordersMenu)){showList(orderList);}
                        else if("3".equals(ordersMenu)){deleteOrder(orderList); getFileFromOrdersList(orderList);}
                        else { errorMessage();}
                    }
                }
                else {errorMessage();}
            }
        } catch (Exception ex){ex.printStackTrace();}
        finally { scannerMain.close(); }








    }
}
