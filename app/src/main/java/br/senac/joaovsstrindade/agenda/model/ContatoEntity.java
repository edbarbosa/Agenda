package br.senac.joaovsstrindade.agenda.model;

import java.io.Serializable;

public class ContatoEntity implements Serializable {
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private Double pontuacao;


    public ContatoEntity(String nome, String email, String telefone, Double pontuacao) {

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.pontuacao = pontuacao;


    }

    public ContatoEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "nome='"+nome +'\''+
            ", email='"+email +'\''+
            ", telefone='"+telefone +'\''+
            ", pontuacao="+pontuacao;

    }
}

