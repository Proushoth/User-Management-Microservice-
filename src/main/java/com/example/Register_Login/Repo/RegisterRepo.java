package com.example.Register_Login.Repo;

import com.example.Register_Login.Entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface RegisterRepo extends JpaRepository<Register,Integer> {

    Optional<Register> findOneByEmailandPassword(String email, String password);
    Register findByEmail(String email);
}
