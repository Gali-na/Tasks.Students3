package org.example;

import java.util.Arrays;

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
                && student.getGroupName() != null) {
            for (int i = 0; i < students.length; i++) {
                if (this.students[i] == null && i <= 9) {
                    students[i] = student;
                    rezult = "Student added to group";
                    break;
                }
            }
        } else {
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
                && student.getGroupName() != null) {
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

    public String searchBySurname(String surname) {
        Student [] rezultCurrent = new Student[10];
        Student [] rezult = new Student[1];
        int j=0;
        if (surname != null && surname.isEmpty()!=true) {
            for (int i = 0; i < this.students.length; i++) {
                  if(this.students[i]!=null &&  this.students[i].getSurname().equals(surname)) {
                      rezultCurrent[j]=students[i];
                      j++;
                  }
            }

          rezult =   Arrays.copyOfRange(rezultCurrent, 0, rezultCurrent.length);
        } else {
            System.out.println("Data transferred incorrectly");
        }
        return Arrays.toString(rezult);
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        Arrays.sort(this.getStudents(), new SortBySurname());
        return "Group{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
