import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import com.mockito.entities.Mensagem;
import com.mockito.services.EnviarMensagem;

@ExtendWith(MockitoExtension.class)
class EnviarMensagemTeste {

    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentoClasse() {
        Mockito.verifyNoInteractions(enviarMensagem);

        Mensagem mensagem = new Mensagem("Luiz Neto", "Catarina", "Hello World");
        enviarMensagem.adicionarMensagem(mensagem);
        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);

        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
    }
}
