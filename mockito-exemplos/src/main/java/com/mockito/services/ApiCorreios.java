package com.mockito.services;

import com.mockito.entities.DadosLocalizacao;

public class ApiCorreios {

    public DadosLocalizacao buscarDadosPeloCep(String cep) {

        return new DadosLocalizacao("XX", "Cidade Inexistente", "Logradouro Inexistente", "", "Bairro Inexistente");
    }
}