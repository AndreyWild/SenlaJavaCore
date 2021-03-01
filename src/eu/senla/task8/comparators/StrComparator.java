package eu.senla.task8.comparators;

import java.util.Comparator;

public class StrComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
