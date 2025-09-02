package com.senac.ShelflyBackEnd.service;

import com.senac.ShelflyBackEnd.repository.GeneroRepository;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {

    private GeneroRepository generoRepository;

    public GeneroService(GeneroRepository generoRepository){
        this.generoRepository = generoRepository;
    }
}
