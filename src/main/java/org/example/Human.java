package org.example;

import java.util.Objects;

public class Human {
    private  String name;
    private String surname;
    private int age;
    private String gender;

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name!=null && name.isEmpty()!=true) {

            this.name = name;
        } else {
            System.out.println("Data sent incorrectly try again");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname!= null && surname.isEmpty()!= true ) {
            this.surname = surname;
        } else {
            System.out.println("Data sent incorrectly try again");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age<=120 && age>=15) {
        this.age = age;
        } else {
            System.out.println("Data sent incorrectly try again");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return getAge() == human.getAge() && getName().equals(human.getName()) && getSurname().equals(human.getSurname()) && getGender().equals(human.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge(), getGender());
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\''
                ;
    }
}
