package com.senac.ShelflyBackEnd.service;

import com.senac.ShelflyBackEnd.repository.MarcacaoRepository;
import org.springframework.stereotype.Service;

@Service
public class MarcacaoService {

    private MarcacaoRepository marcacaoRepository;

    public MarcacaoService(MarcacaoRepository marcacaoRepository){
        this.marcacaoRepository = marcacaoRepository;
    }
}
