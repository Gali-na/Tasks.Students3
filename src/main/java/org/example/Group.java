package org.example;

public class Group {
    private Student[] students;

    public Group() {
        this.students = new Student[10];
    }

    public String addStudent(Student student) {
        String rezult = "The group is full, it is imposlesib to add a student";
        if (student != null) {
            for (int i = 0; i < students.length; i++) {
                if (this.students[i] == null && i<=9) {
                    students[i] = student;
                    rezult = "Student added to group";
                    break;
                }
            }
        }
        return rezult;
    }
    public void showStudentsInGroup() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            }
        }
    }

}
