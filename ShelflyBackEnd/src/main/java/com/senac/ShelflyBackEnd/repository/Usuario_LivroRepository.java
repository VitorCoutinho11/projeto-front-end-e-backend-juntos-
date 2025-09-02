package com.senac.ShelflyBackEnd.repository;

import com.senac.ShelflyBackEnd.entity.Usuario_livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuario_LivroRepository extends JpaRepository <Usuario_livro, Integer> {
}
