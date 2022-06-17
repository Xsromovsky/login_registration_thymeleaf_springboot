package com.project.login.registration.login_registration_thymeleaf_springboot.service;

import com.project.login.registration.login_registration_thymeleaf_springboot.model.User;
import com.project.login.registration.login_registration_thymeleaf_springboot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);

}
