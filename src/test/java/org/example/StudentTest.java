package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student createStudent() {
        Student student;
        student = new Student();
        student.setGroupName("GGG-12");
        return student;
    }

    @Test
    void getGroupName() {
        assertEquals("GGG-12",createStudent().getGroupName());
    }

    @Test
    void setGroupName_ArgumentIsNotNullIsNotEmpty_SetUpArgument() {
      assertEquals("GGG-12",createStudent().getGroupName());
    }

    @Test
    void setGroupName_ArgumentIsNull_SetUpArgument() {
        Student student = new Student();
        String cousoleOutputStream = "";
        String result = "Data sent incorrectly try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            student.setName(null);
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(result, cousoleOutputStream);
    }

    @Test
    void setGroupName_ArgumentIsEmpty_SetUpArgument() {
        Student student = new Student();
        String cousoleOutputStream = "";
        String result = "Data sent incorrectly try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            student.setName("");
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(result, cousoleOutputStream);
    }

}