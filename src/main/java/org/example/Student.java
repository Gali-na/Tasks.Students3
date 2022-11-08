package org.example;

import java.util.Objects;

public class Student extends Human  {
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        if(groupName.isEmpty()!=true && groupName!=null) {
            this.groupName = groupName;
        }
        else {
            System.out.println("Data sent incorrectly try again");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(getGroupName(), student.getGroupName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGroupName());
    }

    @Override
    public String toString() {
        return super.toString() +", groupName='" + groupName + '\'';
    }
}
