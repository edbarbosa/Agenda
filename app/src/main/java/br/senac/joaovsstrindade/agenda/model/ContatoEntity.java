package br.senac.joaovsstrindade.agenda.model;

public class ContatoEntity {
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private double pontuacao;
    private String  rua;
    private Integer numero;
    private String cidade;

    public ContatoEntity(String nome,String email,  String telefone, double pontuacao, String rua, Integer numero,String cidade) {

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.pontuacao = pontuacao;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;



    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", pontuacao=" + pontuacao +
                ", rua=" + rua +'\'' +
                ", numero=" + numero +'\'' +
                ",cidade=" + cidade ;

    }
}

