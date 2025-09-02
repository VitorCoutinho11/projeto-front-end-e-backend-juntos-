package com.senac.ShelflyBackEnd.repository;

import com.senac.ShelflyBackEnd.entity.Marcacao;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface MarcacaoRepository extends JpaRepository <Marcacao, Integer> {
}
