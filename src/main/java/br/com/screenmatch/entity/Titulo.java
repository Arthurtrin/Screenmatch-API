package br.com.screenmatch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String frase;
    private String personagem;
    private String poster;

    public Titulo() {
    }

    public Titulo(String nome, String personagem, String frase, String poster) {
        this.nome = nome;
        this.personagem = personagem;
        this.frase = frase;
        this.poster = poster;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFrase() {
        return frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public String getPoster() {
        return poster;
    }
}
