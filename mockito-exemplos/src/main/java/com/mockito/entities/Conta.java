package com.mockito.entities;

public class Conta {

    private int saldo;

    public Conta(int saldo) {
        this.saldo = saldo;
    }

    public void pagarBoleto(int valor) {
        validarSaldo(valor);
        debitarSaldo(valor);
        enviarCreditoParaEmissor(valor);
    }

    public void validarSaldo(int valor) {
        if (valor > this.saldo) {
            throw new IllegalStateException("Saldo insuficiente");
        }
    }

    public void debitarSaldo(int valor) {
        setSaldo(getSaldo() - valor);
    }

    public void enviarCreditoParaEmissor(int valor) {
      // TODO document why this method is empty
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
