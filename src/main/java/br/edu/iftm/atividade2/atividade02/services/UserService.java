package br.edu.iftm.atividade2.atividade02.services;

import br.edu.iftm.atividade2.atividade02.models.UserModel;
import br.edu.iftm.atividade2.atividade02.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    public Optional<UserModel> findById(Long id) {
        return userRepository.findById(id);
    }

    public UserModel save(UserModel user) {
        if (!user.getFirstName().isBlank() && !user.getFirstName().isEmpty()) {
            return userRepository.save(user);
        }
        return null;
    }

    public UserModel update(UserModel user) {
        var dbUser = userRepository.findById(user.getId());
        if (dbUser.isPresent()) {
            return userRepository.save(user);
        }
        return null;
    }
    public String delete (Long id){
        var dbUser = userRepository.findById(id);
        if (dbUser.isPresent()) {
            userRepository.deleteById(id);
            return "User deleted";
        }
        return "User not found";
    }

}
