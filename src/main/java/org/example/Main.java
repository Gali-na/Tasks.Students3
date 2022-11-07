package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(18);
        student.setGender("man");
        student.setName("Natalia");
        student.setSurname("Zolotareva");
        student.setGroupName("GIIF10-1");

        Student student2 = new Student();
        student2.setAge(18);
        student2.setGender("man");
        student2.setName("Natalia");
        student2.setSurname("Zolotareva");
        student2.setGroupName("GIIF10-1");
        Group group = new Group();
         group.addStudent(student);
        group.addStudent(student);
        group.addStudent(student2);

        group.addStudent(student);
        group.addStudent(student);
        group.addStudent(student2);
        group.addStudent(student);
        group.addStudent(student);
        group.addStudent(student2);
        group.addStudent(student);
        group.addStudent(student);
        group.addStudent(student2);


    }
}
