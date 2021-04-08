package eu.senla.task16.methods;

import java.time.LocalDate;
import java.util.List;

public class Service {

    public static void errorMessage() { System.out.println("Вы точно поняли что надо делать?"); }

    // Выводит любой список в консоль
    public static <T> void showList(List<T> productList) {
        for (T p : productList) { System.out.println(p); } }

    // Преобразует String в LocalDate
    public static LocalDate getDate(String date) {
        String[] s = date.split("-");
        return LocalDate.of(Integer.parseInt(s[2]), Integer.parseInt(s[1]), Integer.parseInt(s[0])); }
}
