package com.project.login.registration.login_registration_thymeleaf_springboot.service;

import com.project.login.registration.login_registration_thymeleaf_springboot.model.Role;
import com.project.login.registration.login_registration_thymeleaf_springboot.model.User;
import com.project.login.registration.login_registration_thymeleaf_springboot.repository.UserRepository;
import com.project.login.registration.login_registration_thymeleaf_springboot.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto userRegistrationDto) {
        User user = new User();
        user.setFirstName(userRegistrationDto.getFirstName());
        user.setLastName(userRegistrationDto.getLastName());
        user.setEmail(userRegistrationDto.getEmail());
        user.setPassword(userRegistrationDto.getPassword());
        user.setRoles(Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);

    }
}
