package org.example;

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
        if(name.isEmpty()!=true && name!=null) {
            this.name = name;
        } else {
            System.out.println("Data sent incorrectly try again");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname.isEmpty()!= true && surname!= null) {
            this.surname = surname;
        } else {
            System.out.println("Data sent incorrectly try again");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=1 && age<=120 ) {
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
    public String toString() {
        return  "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\''
                ;
    }
}
