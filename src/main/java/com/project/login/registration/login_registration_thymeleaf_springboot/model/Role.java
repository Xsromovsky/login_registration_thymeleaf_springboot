package com.project.login.registration.login_registration_thymeleaf_springboot.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public Role() {

    }

    public Role(String name) {
        super();
        this.name = name;
    }


}
