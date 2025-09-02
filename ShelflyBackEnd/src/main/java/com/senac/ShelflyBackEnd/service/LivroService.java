package com.senac.ShelflyBackEnd.service;

import com.senac.ShelflyBackEnd.repository.LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    private LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }
}
