package org.example;

import java.util.Comparator;

public class SortBySurname implements Comparator<Student> {
    @Override
    public int compare(Student human1, Student human2) {
        if (human1 != null && human2 != null) {
            return human1.getSurname().compareTo(human2.getSurname());
        }
        return 0;
    }
}
