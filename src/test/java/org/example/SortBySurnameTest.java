package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortBySurnameTest {
    Student student1 = new Student();
    Student student2 = new Student();
    SortBySurname sortBySurname = new SortBySurname();

    @Test
    void compare_ArgumentFirstLessSecond_ResultIsNegativeNumber() {
      student1.setSurname("Annas");
      student2.setSurname("GAlins");
      int rezult1=student1.getSurname().compareTo(student2.getSurname());
      int rezult2= sortBySurname.compare(student1,student2);
      assertEquals(rezult1,rezult2);
    }

    @Test
    void compare_ArgumentFirstMoreSecond_ResultIsNegativeNumber() {
        student2.setSurname("Annas");
        student1.setSurname("GAlins");
        int rezult1=student1.getSurname().compareTo(student2.getSurname());
        int rezult2= sortBySurname.compare(student1,student2);
        assertEquals(rezult1,rezult2);
    }

    @Test
    void compare_ArgumentFirstIsEqualsSecond_Result0() {
        student2.setSurname("Annas");
        student1.setSurname("Annas");
        int rezult1=student1.getSurname().compareTo(student2.getSurname());
        int rezult2= sortBySurname.compare(student1,student2);
        assertEquals(rezult1,rezult2);
    }
}