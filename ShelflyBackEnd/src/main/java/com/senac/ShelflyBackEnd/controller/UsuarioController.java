package com.senac.ShelflyBackEnd.controller;

import com.senac.ShelflyBackEnd.entity.Usuario;
import com.senac.ShelflyBackEnd.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/usuario")
@Tag(name = "Usuario", description = "API para gerenciamento de usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping("/listar")
    @Operation(summary = "listar Usuarios", description = "endpoint para listar todos os usuarios")
    public ResponseEntity<List<Usuario>> listarUsuarios () {
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }
}
