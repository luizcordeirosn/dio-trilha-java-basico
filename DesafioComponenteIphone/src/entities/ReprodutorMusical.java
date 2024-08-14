package entities;

public class ReprodutorMusical extends Iphone {
    
    public String tocar() {
        return "Reproduzindo a música...";
    }
    
    public String pausar() {
        return "Música pausada.";
    }

    public String selecionarMusica(String musica){
        return "Música '" + musica + "' selecionada.";
    }
}
