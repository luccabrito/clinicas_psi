package br.com.lucca.mvc.clinicas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clinica {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeClinica;
    private String endereco;
    private String telefone;
    private String abordagem;
    private String descricao;
    private Boolean temAtendimentoEmergencial;

    public Long getId() {
        return id;
    }

    public Boolean temAtendimentoEmergencial() {
        return temAtendimentoEmergencial;
    }

    public void setTemAtendimentoEmergencial(Boolean temAtendimentoEmergencial) {
        this.temAtendimentoEmergencial = temAtendimentoEmergencial;
    }

    public String getNomeClinica() {
        return nomeClinica;
    }

    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAbordagem() {
        return abordagem;
    }

    public void setAbordagem(String abordagem) {
        this.abordagem = abordagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}