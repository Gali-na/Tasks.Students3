package org.example;

import java.util.Comparator;

public class SortByAge implements Comparator<Human> {
    @Override
    public int compare(Human human1, Human human2) {
        if (human1.getAge()<human2.getAge()) {
            return -1;
        }
        if (human1.getAge()>human2.getAge()) {
            return +1;
        }
        return 0;
    }
}
