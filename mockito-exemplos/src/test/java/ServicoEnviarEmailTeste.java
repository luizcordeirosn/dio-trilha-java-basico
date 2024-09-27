import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.mockito.entities.Email;
import com.mockito.enums.Formato;
import com.mockito.services.PlataformaEnvio;
import com.mockito.services.ServicoEnviarEmail;

@ExtendWith(MockitoExtension.class)
class ServicoEnviarEmailTeste {
    
    @Mock
    private PlataformaEnvio plataforma;

    @InjectMocks
    private ServicoEnviarEmail servico;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEnviadosParaPlataforma() {

        String enderecoEmail = "usuario@teste.com.br";
        String mensagem = "Olá mundo";
        boolean formatoHtml = false;

        servico.enviarEmail(enderecoEmail, mensagem, formatoHtml);

        Mockito.verify(plataforma).enviarEmail(captor.capture());

        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXT, emailCapturado.getFormato());
    }
}
