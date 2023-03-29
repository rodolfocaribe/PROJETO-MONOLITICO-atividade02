package br.edu.iftm.atividade2.atividade02.services;


import br.edu.iftm.atividade2.atividade02.models.EmailModel;
import br.edu.iftm.atividade2.atividade02.models.UserModel;
import br.edu.iftm.atividade2.atividade02.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmailService {
    @Autowired
    private EmailRepository emailRepository;

    public List<EmailModel> findAll() {
        return emailRepository.findAll();
    }

    public Optional<EmailModel> findById(Long id) {
        return emailRepository.findById(id);
    }

    public EmailModel save(EmailModel email) {
        if (!email.getTo().isBlank() && !email.getTo().isEmpty()) {
            return emailRepository.save(email);
        }
        return null;
    }
    public EmailModel update(EmailModel email) {
        var dbEmail = emailRepository.findById(email.getId());
        if (dbEmail.isPresent()) {
            return emailRepository.save(email);
        }
        return null;
    }
    public String delete (Long id){
        var dbEmail = emailRepository.findById(id);
        if (dbEmail.isPresent()) {
            emailRepository.deleteById(id);
            return "Email deleted";
        }
        return "Email not found";
    }

}
