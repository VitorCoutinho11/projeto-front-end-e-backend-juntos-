package com.senac.ShelflyBackEnd.service;

import com.senac.ShelflyBackEnd.entity.Genero;
import com.senac.ShelflyBackEnd.entity.Usuario;
import com.senac.ShelflyBackEnd.repository.GeneroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    private GeneroRepository generoRepository;

    public GeneroService(GeneroRepository generoRepository){
        this.generoRepository = generoRepository;
    }

    public List<Genero> listarGeneros(){return this.generoRepository.findAll();}
}
