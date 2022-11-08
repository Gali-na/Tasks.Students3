package org.example;

public class Group {
    private Student[] students;

    public Group() {
        this.students = new Student[10];
    }

    public String addStudent(Student student) {
        String rezult = "The group is full, it is imposlesib to add a student";
        if (student != null
                && student.getName() != null
                && student.getGender() != null
                && student.getSurname() != null
                && student.getGroupName() != null)
        {
            for (int i = 0; i < students.length; i++) {
                if (this.students[i] == null && i <= 9) {
                    students[i] = student;
                    rezult = "Student added to group";
                    break;
                }
            }
        } else{
            rezult = "The student's identity does not contain all the " +
                    "required information, the student was not " +
                    "added to the group";
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

    public String deleteStudent(Student student) {
        String rezult = "This group does not contain the specified student";
        if (student != null
                && student.getName() != null
                && student.getGender() != null
                && student.getSurname() != null
                && student.getGroupName() != null){
            for (int i = 0; i < this.students.length; i++) {
                if (students[i] != null) {
                    if (students[i].equals(student)) {
                        students[i] = null;
                        rezult = "Student removed from group";
                    }
                }
            }
        }
        return rezult;
    }

}
