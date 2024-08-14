package entities;

public class NavegadorInternet extends Iphone{
    
    public String exibirPagina(String url) {
        return "Exibindo a página: " + url;
    }
    
    public String adicionarNovaAba() {
        return "Nova aba aberta.";
    }
    
    public String atualizarPagina() {
        return "Página atualizada.";
    }
}
