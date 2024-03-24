package com.aravind.springdemo.validatons.controller;

import com.aravind.springdemo.validatons.advice.UserNotFoundException;
import com.aravind.springdemo.validatons.dto.UserRequest;
import com.aravind.springdemo.validatons.entity.User;
import com.aravind.springdemo.validatons.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signUp")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest) {
        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.getAllUser());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUser(@PathVariable int id) throws UserNotFoundException {
        return ResponseEntity.ok(userService.getUser(id));
    }


}
