package br.edu.iftm.atividade2.atividade02.controllers;


import br.edu.iftm.atividade2.atividade02.models.EmailModel;
import br.edu.iftm.atividade2.atividade02.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app/v1/emails")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @GetMapping
    public List<EmailModel> findAll() {
        return emailService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<EmailModel> findB(@PathVariable("id") Long id) {
        return emailService.findById(id);
    }
    @PostMapping
    public EmailModel save(@RequestBody EmailModel email) {
        return emailService.save(email);
    }
    @PutMapping
    public EmailModel update(@RequestBody EmailModel email) {
        return emailService.update(email);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        return emailService.delete(id);
    }
}
