package com.senac.ShelflyBackEnd.entity;

import jakarta.persistence.*;

import java.awt.*;
import java.sql.Timestamp;

@Entity
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "avaliacao_id")
    private int id;

    @Column(name = "avaliacao_nota", columnDefinition = "Decimal")
    private float nota;

    @Column(name = "avaliacao_comentario", columnDefinition = "TEXT")
    private String comentario;

    @Column(name = "avaliacao_dataAvaliacao")
    private Timestamp dataAvaliacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Timestamp getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(Timestamp dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }
}
