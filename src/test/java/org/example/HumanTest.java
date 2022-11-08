package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    private Human createHuman() {
        Human human;
        human = new Human();
        human.setName("Natalia");
        human.setSurname("Zolotareva");
        human.setAge(18);
        human.setGender("woman");
        return human;
    }


    @Test
    void getName() {
        assertEquals(18, createHuman().getAge());
        assertEquals("Natalia", createHuman().getName());
        assertEquals("Zolotareva", createHuman().getSurname());
    }

    @Test
    void setName_ArgumentIsNotNullIsNotEmpty_SetUpArgument() {
     createHuman();
        assertEquals("Natalia", createHuman().getName());
    }

    @Test
    void setName_ArgumentIsNull_GetMassage() {
       Human human = new Human();
        String cousoleOutputStream = "";
        String result = "Data sent incorrectly try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setName(null);
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
    void setName_ArgumentIsEmpty_GetMassage() {
        Human human = new Human();
        String cousoleOutputStream = "";
        String result = "Data sent incorrectly try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setName("");
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
    void getSurname() {
       assertEquals("Zolotareva",createHuman().getSurname());
    }

    @Test
    void setSurname_ArgumentIsNotNullIsNotEmpty_SetUpArgument() {
        assertEquals("Zolotareva",createHuman().getSurname());
    }

    @Test
    void setSurname_ArgumentIsNull_GetMassage() {
        Human human = new Human();
        String cousoleOutputStream = "";
        String result = "Data sent incorrectly try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setSurname(null);
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
    void setSurname_ArgumentIsEmpty_GetMassage() {
        Human human = new Human();
        String cousoleOutputStream = "";
        String result = "Data sent incorrectly try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setSurname("");
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
    void getAge() {
        assertEquals(18,createHuman().getAge());
    }

    @Test
    void setAge_Argumentless120AndMore15_SetUpArgument() {
        assertEquals(18,createHuman().getAge());
    }

    @Test
    void setAge_ArgumentMore120_GetMassage() {
        Human human= new Human();

        String cousoleOutputStream = "";
        String result = "Data sent incorrectly try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setAge(150);
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
    void setAge_ArgumentLess15_GetMassage() {
        Human human= new Human();

        String cousoleOutputStream = "";
        String result = "Data sent incorrectly try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            human.setAge(12);
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
    void getGender() {
        assertEquals("woman",createHuman().getGender());
    }

    @Test
    void setGender() {
        assertEquals("woman",createHuman().getGender());
    }
}