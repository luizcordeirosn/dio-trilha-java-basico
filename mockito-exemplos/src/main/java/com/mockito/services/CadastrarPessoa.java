package com.mockito.services;

import java.time.LocalDate;
import com.mockito.entities.DadosLocalizacao;
import com.mockito.entities.Pessoa;

public class CadastrarPessoa {
    
    private ApiCorreios apiCorreios;

    public CadastrarPessoa(ApiCorreios apiCorreios) {
        this.apiCorreios = apiCorreios;
    }

    public Pessoa cadastrarPessoa(String nome, String documento, LocalDate nascimento, String cep) {
        Pessoa pessoa =  new Pessoa(nome, documento, nascimento);
        DadosLocalizacao dadosLocalizacao = apiCorreios.buscarDadosPeloCep(cep);
        pessoa.setEndereco(dadosLocalizacao);
        return pessoa;
    }
}
