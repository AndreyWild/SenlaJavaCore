package eu.senla.task11.comparators;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer int1, Integer int2) {
        if (int1 == int2) {
            return 0;
        } else if (int1 > int2) {
            return -1;
        } else {
            return 1;
        }
    }
}
