package com.project.login.registration.login_registration_thymeleaf_springboot.web.dto;


import lombok.Data;

@Data
public class UserRegistrationDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserRegistrationDto(){

    }
    //create a constructor for the UserRegistrationDto class with super
    public UserRegistrationDto(String firstName, String lastName, String email, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }



}
