package br.com.lucca.mvc.clinicas.dto;

import br.com.lucca.mvc.clinicas.model.Clinica;

import javax.validation.constraints.NotBlank;

public class RequisicaoNovaClinica {

    @NotBlank
    private String nomeClinica;

    @NotBlank
    private String endereco;

    @NotBlank
    private String telefone;
    private Boolean temAtendimentoEmergencial;
    private String descricao;
    private String abordagem;

    public String getAbordagem() {
        return abordagem;
    }

    public void setAbordagem(String abordagem) {
        this.abordagem = abordagem;
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

    public Boolean getTemAtendimentoEmergencial() {
        return temAtendimentoEmergencial;
    }

    public void setTemAtendimentoEmergencial(Boolean temAtendimentoEmergencial) {
        this.temAtendimentoEmergencial = temAtendimentoEmergencial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Clinica toClinica() {
        Clinica clinica = new Clinica();
        clinica.setNomeClinica(nomeClinica);
        clinica.setEndereco(endereco);
        clinica.setTelefone(telefone);
        clinica.setTemAtendimentoEmergencial(temAtendimentoEmergencial);
        clinica.setDescricao(descricao);
        clinica.setAbordagem(abordagem);
        return clinica;
    }
}
