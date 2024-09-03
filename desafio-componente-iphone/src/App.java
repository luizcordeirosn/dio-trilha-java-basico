import entities.AparelhoTelefonico;
import entities.NavegadorInternet;
import entities.ReprodutorMusical;

public class App {
    public static void main(String[] args) throws Exception {
        
        ReprodutorMusical iphoneA = new ReprodutorMusical();

        System.out.println(iphoneA.tocar());
        System.out.println(iphoneA.pausar());
        System.out.println(iphoneA.selecionarMusica("Let it go"));

        AparelhoTelefonico iphoneB = new AparelhoTelefonico();

        System.out.println(iphoneB.ligar("81998765432"));
        System.out.println(iphoneB.atender());
        System.out.println(iphoneB.iniciarCorreioVoz());

        NavegadorInternet iphoneC = new NavegadorInternet();

        System.out.println(iphoneC.exibirPagina("github.com"));
        System.out.println(iphoneC.adicionarNovaAba());
        System.out.println(iphoneC.atualizarPagina());
    }
}
