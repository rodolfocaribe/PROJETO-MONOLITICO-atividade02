package br.edu.iftm.atividade2.atividade02.repositories;


import br.edu.iftm.atividade2.atividade02.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
