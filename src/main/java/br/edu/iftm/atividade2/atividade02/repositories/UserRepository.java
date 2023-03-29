package br.edu.iftm.atividade2.atividade02.repositories;


import br.edu.iftm.atividade2.atividade02.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
