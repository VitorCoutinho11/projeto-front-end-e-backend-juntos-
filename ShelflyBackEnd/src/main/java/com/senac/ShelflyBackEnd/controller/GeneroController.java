package com.senac.ShelflyBackEnd.controller;

import com.senac.ShelflyBackEnd.entity.Genero;
import com.senac.ShelflyBackEnd.service.GeneroService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/genero")
@Tag(name = "Genero", description = "API para gerenciamento de generos dos livros")
public class GeneroController {

    private GeneroService generoService;

    public  GeneroController(GeneroService generoService){
        this.generoService = generoService;
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar generos", description = "Endpoint para listar todos os generos de livros")
    public ResponseEntity<List<Genero>> listarGeneros() {
        return ResponseEntity.ok(generoService.listarGeneros());
    }

}
