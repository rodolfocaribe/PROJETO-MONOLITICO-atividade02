package br.edu.iftm.atividade2.atividade02.controllers;


import br.edu.iftm.atividade2.atividade02.models.UserModel;
import br.edu.iftm.atividade2.atividade02.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserModel> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UserModel> findB(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public UserModel save(@RequestBody UserModel user) {
        return userService.save(user);
    }
    @PutMapping
    public UserModel update(@RequestBody UserModel user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

}
