package org.example;

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
    public String toString() {
        return super.toString() +", groupName='" + groupName + '\'';
    }
}
