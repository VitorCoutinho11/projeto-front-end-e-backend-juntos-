package com.senac.ShelflyBackEnd.controller;

import com.senac.ShelflyBackEnd.entity.Livro;
import com.senac.ShelflyBackEnd.service.LivroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/livro")
@Tag(name = "Livro", description = "API para gerenciamento dos livros")
public class LivroController {

    private LivroService livroService;

    public LivroController(LivroService livroService){
        this.livroService = livroService;
    }


    @GetMapping("/listar")
    @Operation(summary = "listar livros", description = "endpoint para listar todos os livros")
    public ResponseEntity<List<Livro>> listarLivros(){
        return ResponseEntity.ok(livroService.listarLivros());
    }
}
