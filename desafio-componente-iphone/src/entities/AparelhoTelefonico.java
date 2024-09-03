package entities;

public class AparelhoTelefonico extends Iphone{
    
    public String ligar(String numero) {
        return "Ligando para o número " + numero + "...";
    }
    
    public String atender() {
        return "Chamada atendida.";
    }
    
    public String iniciarCorreioVoz() {
        return "Correio de voz ativado.";
    }
}
