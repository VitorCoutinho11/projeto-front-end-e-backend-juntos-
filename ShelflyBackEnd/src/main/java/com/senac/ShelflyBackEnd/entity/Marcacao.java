package com.senac.ShelflyBackEnd.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Marcacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marcacao_id")
    private int id;

    @Column(name = "marcacao_pagina")
    private int pagina;

    @Column(name = "marcacao_anotacao", columnDefinition = "TEXT")
    private String anotacao;

    @Column(name = "marcacao_data")
    private LocalDateTime data;

    @OneToOne
    @JoinColumn(name = "usuario_livro_id")
    private Usuario_livro usuarioLivro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Usuario_livro getUsuarioLivro() {
        return usuarioLivro;
    }

    public void setUsuarioLivro(Usuario_livro usuarioLivro) {
        this.usuarioLivro = usuarioLivro;
    }
}
