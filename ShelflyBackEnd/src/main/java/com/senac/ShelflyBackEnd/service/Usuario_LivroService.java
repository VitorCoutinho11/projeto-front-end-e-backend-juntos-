package com.senac.ShelflyBackEnd.service;

import com.senac.ShelflyBackEnd.repository.Usuario_LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class Usuario_LivroService {

    private Usuario_LivroRepository usuarioLivroRepository;

    public Usuario_LivroService(Usuario_LivroRepository usuarioLivroRepository){
        this.usuarioLivroRepository = usuarioLivroRepository;
    }
}
