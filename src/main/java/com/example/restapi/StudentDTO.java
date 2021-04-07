package com.example.restapi;

public class StudentDTO {

    private String emailAddress;
    private String name;
    private String purchasedPackage;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurchasedPackage() {
        return purchasedPackage;
    }

    public void setPurchasedPackage(String purchasedPackage) {
        this.purchasedPackage = purchasedPackage;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "emailAddress='" + emailAddress + '\'' +
                ", name='" + name + '\'' +
                ", purchasedPackage='" + purchasedPackage + '\'' +
                '}';
    }

    public StudentDTO(String emailAddress, String name, String purchasedPackage) {
        this.emailAddress = emailAddress;
        this.name = name;
        this.purchasedPackage = purchasedPackage;
    }
}
