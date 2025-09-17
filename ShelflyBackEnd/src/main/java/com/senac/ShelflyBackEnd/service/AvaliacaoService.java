package com.senac.ShelflyBackEnd.service;

import com.senac.ShelflyBackEnd.entity.Avaliacao;
import com.senac.ShelflyBackEnd.repository.AvaliacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {

    private AvaliacaoRepository avaliacaoRepository;

    public  AvaliacaoService(AvaliacaoRepository avaliacaoRepository){
        this.avaliacaoRepository = avaliacaoRepository;
    }

    public List<Avaliacao> listarAvaliacoes(){
        return this.avaliacaoRepository.findAll();
    }
}
