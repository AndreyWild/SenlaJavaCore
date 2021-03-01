package eu.senla.task8.comparators;

import eu.senla.task8.students.Students;

import java.util.Comparator;

public class IdStudCompar implements Comparator<Students> {
    @Override
    public int compare(Students stud1, Students stud2) {
        if ((stud1.getId() - stud2.getId()) == 0 ) {return 0;}
        else if ((stud1.getId() - stud2.getId()) > 0) {return -1;}
        else {return 1;}
    }
}
