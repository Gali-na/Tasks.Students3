package org.example;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(18);
        student.setGender("woman");
        student.setName("Natalia");
        student.setSurname("Zolotareva");
        student.setGroupName("GIIF10-1");

        Student student2 = new Student();
        student2.setAge(18);
        student2.setGender("man");
        student2.setName("Yriy");
        student2.setSurname("Zolotareva");
        student2.setGroupName("GIIF10-1");

        Student student3 = new Student();
        student3.setAge(18);
        student3.setGender("man");
        student3.setName("Sergey");
        student3.setSurname("Tsivka");
        student3.setGroupName("GIIF10-1");
        Group group = new Group();

        Student student4 = new Student();
        student4.setAge(18);
        student4.setGender("woman");
        student4.setName("Galina");
        student4.setSurname("Tsivka");
        student4.setGroupName("GIIF10-1");

        Student student5 = new Student();
        student5.setAge(18);
        student5.setGender("woman");
        student5.setName("Luba");
        student5.setSurname("Ostapenko");
        student5.setGroupName("GIIF10-1");

        Student student6 = new Student();
        student6.setAge(18);
        student6.setGender("man");
        student6.setName("Sergey");
        student6.setSurname("Ostapenko");
        student6.setGroupName("GIIF10-1");

        Student student7 = new Student();
        student7.setAge(18);
        student7.setGender("woman");
        student7.setName("Ira");
        student7.setSurname("Dykonova");
        student7.setGroupName("GIIF10-1");

        Student student9 = new Student();
        student9.setAge(18);
        student9.setGender("woman");
        student9.setName("Tany");
        student9.setSurname("Gaydar");
        student9.setGroupName("GIIF10-1");

        Student student10 = new Student();
        student10.setAge(18);
        student10.setGender("woman");
        student10.setName("Macha");
        student10.setSurname("Snina");
        student10.setGroupName("GIIF10-1");
        Student student8 = new Student();

        System.out.println( group.addStudent(student));
        System.out.println( group.addStudent(student2));
        System.out.println( group.addStudent(student3));
        System.out.println( group.addStudent(student4));
        System.out.println(group.addStudent(student5));
        System.out.println(group.addStudent(student6));
        System.out.println(group.addStudent(student7));
        System.out.println( group.addStudent(student9));
         System.out.println(group.addStudent(student10));
        System.out.println( group.addStudent(student8));
       /* System.out.println(group.addStudent(student));
        System.out.println(group.addStudent(student2));*/
         group.showStudentsInGroup();
        System.out.println(group.deleteStudent(student10));
        System.out.println(group.deleteStudent(student8));
        Arrays.sort(group,new SortBySurname());

    }
}
