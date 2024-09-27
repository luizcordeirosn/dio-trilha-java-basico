package com.mockito.services;

import com.mockito.entities.Email;
import com.mockito.enums.Formato;

public class ServicoEnviarEmail {

    private PlataformaEnvio plataforma;

    public void enviarEmail(String enderecoEmail, String mensagem, boolean formatoHtml) {

        Email email = null;

        if (formatoHtml) {
            email = new Email(enderecoEmail, mensagem, Formato.HTML);
        } else {
            email = new Email(enderecoEmail, mensagem, Formato.TEXT);
        }

        plataforma.enviarEmail(email);
    }
}
