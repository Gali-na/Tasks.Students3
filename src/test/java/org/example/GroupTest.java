package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {
    Group groupTest;

    @BeforeEach
    void creatingGroupObject() {
        groupTest = new Group();
    }


    private Student getStudentFilledInArguments() {
        Student student = new Student();
        student.setAge(18);
        student.setGender("woman");
        student.setName("Natalia");
        student.setSurname("Zolotareva");
        student.setGroupName("GIIF10-1");
        return student;
    }

    @Test
    void addStudent_PassingOneArgumentIfGroupIsEmpty_AddArgument() {
        Student[] studentsArry = new Student[10];
        studentsArry[0] = getStudentFilledInArguments();
        groupTest.addStudent(getStudentFilledInArguments());
        assertArrayEquals(studentsArry, groupTest.getStudents());

    }

    @Test
    void addStudent_PassingOneArgumentIsNullIfGroupIsEmpty_GetMAssage() {
        String result = "The student's identity does not contain all the required information, the student was not added to the group";
        Student student = null;
        assertEquals(result, groupTest.addStudent(student));
    }

    @Test
    void addStudent_PassingOneArgumentWithNameNullIfGroupIsEmpty_GetMassage() {
        String result = "The student's identity does not contain all the required information, the student was not added to the group";
        Student student = new Student();
        student.setName(null);
        assertEquals(result, groupTest.addStudent(student));
    }

    @Test
    void addStudent_PassingOneArgumentWithSurnameNullIfGroupIsEmpty_GetMassage() {
        String result = "The student's identity does not contain all the required information, the student was not added to the group";
        Student student = new Student();
        student.setSurname(null);
        assertEquals(result, groupTest.addStudent(student));
    }

    @Test
    void addStudent_PassingOneArgumentWithGenderNullIfGroupIsEmpty_GetMassage() {
        String result = "The student's identity does not contain all the required information, the student was not added to the group";
        Student student = new Student();
        student.setGender(null);
        assertEquals(result, groupTest.addStudent(student));
    }

    @Test
    void addStudent_PassingOneArgumentWithGroupNameNullIfGroupIsEmpty_GetMassage() {
        String result = "The student's identity does not contain all the required information, the student was not added to the group";
        Student student = new Student();
        student.setGroupName(null);
        assertEquals(result, groupTest.addStudent(student));
    }

    @Test
    void addStudent_PassingOneArgumentWithAge0IfGroupIsEmpty_GetMassage() {
        String result = "The student's identity does not contain all the required information, the student was not added to the group";
        Student student = new Student();
        student.setAge(0);
        assertEquals(result, groupTest.addStudent(student));
    }

    @Test()
    void addStudent_PassingOneArgumentIfGroupFull_GetMassage() {
        String expected = "The group is full adding a student is not possible";
        for (int i = 0; i <= 9; i++) {
            groupTest.addStudent(getStudentFilledInArguments());
        }
        String rezult = groupTest.addStudent(getStudentFilledInArguments());
        assertEquals(expected, rezult);
    }

    @Test
    void deleteStudent_DeletingStudentIfStudentWasInGroup_GetMessage() {
        String rezult = "Student removed from group";
        groupTest.addStudent(getStudentFilledInArguments());
        assertEquals(rezult, groupTest.deleteStudent(getStudentFilledInArguments()));
    }

    @Test
    void deleteStudent_DeletingStudentIfStudentWasNotInGroup_GetMessage() {
        String rezult = "This group does ont contain the specified student";
        groupTest.addStudent(getStudentFilledInArguments());
        Student student = new Student();
        student.setAge(19);
        student.setGender("woman");
        student.setName("Natalia");
        student.setSurname("Zolotareva");
        student.setGroupName("GIIF10-1");
        assertEquals(rezult, groupTest.deleteStudent(student));
    }

    @Test
    void deleteStudent_DeletingStudentIfStudentHasNameIsNull_GetMessag() {
        String rezult = "This group does ont contain the specified student";
        groupTest.addStudent(getStudentFilledInArguments());
        Student student = new Student();
        student.setAge(19);
        student.setGender("woman");
        student.setName(null);
        student.setSurname("Zolotareva");
        student.setGroupName("GIIF10-1");
        assertEquals(rezult, groupTest.deleteStudent(student));
    }

    @Test
    void deleteStudent_DeletingStudentIfStudentHasSurnameIsNull_GetMessag() {
        String rezult = "This group does ont contain the specified student";
        groupTest.addStudent(getStudentFilledInArguments());
        Student student = new Student();
        student.setAge(19);
        student.setGender("woman");
        student.setName("Natalia");
        student.setSurname(null);
        student.setGroupName("GIIF10-1");
        assertEquals(rezult, groupTest.deleteStudent(student));
    }

    @Test
    void deleteStudent_DeletingStudentIfStudentHasGAnderIsNull_GetMessag() {
        String rezult = "This group does ont contain the specified student";
        groupTest.addStudent(getStudentFilledInArguments());
        Student student = new Student();
        student.setAge(19);
        student.setGender(null);
        student.setName("Natalia");
        student.setSurname("Zolotareva");
        student.setGroupName("GIIF10-1");
        assertEquals(rezult, groupTest.deleteStudent(student));
    }

    @Test
    void deleteStudent_DeletingStudentIfStudentHasGroupNAmeIsNull_GetMessag() {
        String rezult = "This group does ont contain the specified student";
        groupTest.addStudent(getStudentFilledInArguments());
        Student student = new Student();
        student.setAge(19);
        student.setGender("woman");
        student.setName("Natalia");
        student.setSurname("Zolotareva");
        student.setGroupName(null);
        assertEquals(rezult, groupTest.deleteStudent(student));
    }

    @Test
    void deleteStudent_DeletingStudentIfStudentHasAge0_GetMessag() {
        String rezult = "This group does ont contain the specified student";
        groupTest.addStudent(getStudentFilledInArguments());
        Student student = new Student();
        student.setAge(0);
        student.setGender("woman");
        student.setName("Natalia");
        student.setSurname("Zolotareva");
        student.setGroupName("GGGG-12");
        assertEquals(rezult, groupTest.deleteStudent(student));
    }

    @Test
    void searchBySurnamePassExistingSurnameInGroup_GetStudentsArray() {
        Student[] student = new Student[2];
        student[0] = getStudentFilledInArguments();
        student[1] = getStudentFilledInArguments();
        groupTest.addStudent(getStudentFilledInArguments());
        groupTest.addStudent(getStudentFilledInArguments());
        assertEquals(Arrays.toString(student), groupTest.searchBySurname("Zolotareva"));
    }

    @Test
    void searchBySurname_PassIsNotExistingSurnameInGroup_Message() {
        String rezult = "Data transferred incorrectly";
        groupTest.addStudent(getStudentFilledInArguments());
        groupTest.addStudent(getStudentFilledInArguments());
        assertEquals(rezult, groupTest.searchBySurname("Zolotarevan"));
    }

    @Test
    void searchBySurname_PassSurnameIsNull_Message() {
        String rezult = "Data transferred incorrectly";
        groupTest.addStudent(getStudentFilledInArguments());
        groupTest.addStudent(getStudentFilledInArguments());
        assertEquals(rezult, groupTest.searchBySurname(null));
    }

    @Test
    void searchBySurname_PassSurnameIsEmpty_Message() {
        String rezult = "Data transferred incorrectly";
        groupTest.addStudent(getStudentFilledInArguments());
        groupTest.addStudent(getStudentFilledInArguments());
        assertEquals(rezult, groupTest.searchBySurname(""));
    }

    @Test
    void getStudents() {
        groupTest.addStudent(getStudentFilledInArguments());
        Student[] students = new Student[10];
        students[0] = getStudentFilledInArguments();
        assertArrayEquals(students, groupTest.getStudents());
    }
}