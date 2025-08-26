package com.senac.ShelflyBackEnd.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private int id;

    @Column(name = "usuario_nome")
    private String nome;

    @Column(name = "usuario_email")
    private String email;

    @Column(name = "usuario_senha")
    private String senha;

    @Column(name = "usuario_data")
    private Timestamp data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }
}
