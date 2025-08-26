package com.senac.ShelflyBackEnd.service;

import com.senac.ShelflyBackEnd.entity.Usuario;
import com.senac.ShelflyBackEnd.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarUsuarios(){
        return this.usuarioRepository.findAll();
    }
}
