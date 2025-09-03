package com.senac.ShelflyBackEnd.service;

import com.senac.ShelflyBackEnd.entity.Livro;
import com.senac.ShelflyBackEnd.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }

    public List<Livro> listarLivros(){return this.livroRepository.findAll();}
}
