package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortByAgeTest {
    Student student1 = new Student();
    Student student2 = new Student();
    SortByAge sortByAge = new SortByAge();
    @Test
    void compare_ArgumentFirstLessSecond_ResultIsNegativeNumber() {
         student1.setAge(15);
         student2.setAge(16);
         assertEquals(-1,sortByAge.compare(student1,student2));
    }

    @Test
    void compare_ArgumentFirstMoreSecond_ResultIsNegativeNumber() {
        student1.setAge(16);
        student2.setAge(15);
        assertEquals(1,sortByAge.compare(student1,student2));
    }

    @Test
    void compare_ArgumentFirsteIsEqualsSecond_ResultIsNegativeNumber() {
        student1.setAge(16);
        student2.setAge(16);
        assertEquals(0,sortByAge.compare(student1,student2));
    }
}