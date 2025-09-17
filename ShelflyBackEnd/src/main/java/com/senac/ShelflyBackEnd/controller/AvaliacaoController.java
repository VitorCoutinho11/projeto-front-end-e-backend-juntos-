package com.senac.ShelflyBackEnd.controller;

import com.senac.ShelflyBackEnd.entity.Avaliacao;
import com.senac.ShelflyBackEnd.service.AvaliacaoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/avaliacao")
@Tag(name = "Avaliacao", description = "API para gerenciamento de Avaliações")
public class AvaliacaoController {

    private AvaliacaoService avaliacaoService;

    public AvaliacaoController(AvaliacaoService avaliacaoService){
        this.avaliacaoService = avaliacaoService;
    }

    @GetMapping("/listar")
    @Operation(summary = "listar Avaliações", description = "endpoint para listar todos as avaliações")
    public ResponseEntity<List<Avaliacao>> listarAvaliacoes () {
        return ResponseEntity.ok(avaliacaoService.listarAvaliacoes());
    }
}
