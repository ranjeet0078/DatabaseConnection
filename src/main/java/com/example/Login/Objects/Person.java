package com.example.Login.Objects;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private String email;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String pass;
    private String contactNumber;
    private String recoveryEmail;

    public Person(){
        super();
    }

    public Person(String name, String email , String address1 , String address2 , String city
            , String state , String pass , String contactNumber, String recoveryEmail){
        this.name = name;
        this.email = email;
        this.address1= address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.pass = pass;
        this.contactNumber = contactNumber;
        this.recoveryEmail = recoveryEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRecoveryEmail() {
        return recoveryEmail;
    }

    public void setRecoveryEmail(String recoveryEmail) {
        this.recoveryEmail = recoveryEmail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
