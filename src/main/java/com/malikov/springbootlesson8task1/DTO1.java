package com.malikov.springbootlesson8task1;

public class DTO1 {
    private String firstName;
    private String lastName;


    public DTO1() {
    }

    public DTO1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
