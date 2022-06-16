package com.project.login.registration.login_registration_thymeleaf_springboot.repository;


import com.project.login.registration.login_registration_thymeleaf_springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
