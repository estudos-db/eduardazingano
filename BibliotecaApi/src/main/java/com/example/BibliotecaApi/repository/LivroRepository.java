package com.example.BibliotecaApi.repository;

import com.example.BibliotecaApi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    List<Livro> findByAlugadoFalse();

    Optional<Livro> findByAutoresNome(String nome);

    List<Livro> findByAlugadoTrue();
}
