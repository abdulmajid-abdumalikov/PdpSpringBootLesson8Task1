package com.malikov.springbootlesson8task1;

public class CombinedDTO {
    private String fullName;
    private String email;
    private String phoneNumber;

    public CombinedDTO(String fullName, String email, String phoneNumber) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public CombinedDTO() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
