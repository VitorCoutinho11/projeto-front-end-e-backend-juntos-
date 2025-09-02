package com.senac.ShelflyBackEnd.repository;

import com.senac.ShelflyBackEnd.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository <Genero, Integer>{

}
