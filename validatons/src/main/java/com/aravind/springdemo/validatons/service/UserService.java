package com.aravind.springdemo.validatons.service;


import com.aravind.springdemo.validatons.advice.UserNotFoundException;
import com.aravind.springdemo.validatons.dto.UserRequest;
import com.aravind.springdemo.validatons.entity.User;
import com.aravind.springdemo.validatons.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest) {
        User user = User.build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
                userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
        return userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {

        User user = userRepository.findUserById(id);
        if(user == null) {
            throw new UserNotFoundException("User not found for id : "+id);
        }
        return user;
    }

}
