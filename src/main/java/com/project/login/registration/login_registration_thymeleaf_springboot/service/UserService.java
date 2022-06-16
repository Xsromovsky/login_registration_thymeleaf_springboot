package com.project.login.registration.login_registration_thymeleaf_springboot.service;

import com.project.login.registration.login_registration_thymeleaf_springboot.model.User;
import com.project.login.registration.login_registration_thymeleaf_springboot.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto userRegistrationDto);

}
