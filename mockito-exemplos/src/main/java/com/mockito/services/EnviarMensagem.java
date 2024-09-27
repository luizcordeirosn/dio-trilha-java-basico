package com.mockito.services;

import java.util.ArrayList;
import java.util.List;

import com.mockito.entities.Mensagem;

public class EnviarMensagem {
    
    private List<Mensagem> mensagens = new ArrayList<>();

    public void adicionarMensagem(Mensagem mensagem) {
        this.mensagens.add(mensagem);
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }
}
