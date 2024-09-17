import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mockito.entities.DadosLocalizacao;
import com.mockito.entities.Pessoa;
import com.mockito.services.ApiCorreios;
import com.mockito.services.CadastrarPessoa;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiCorreios apiCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosCadastro() {

        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("PE", "Recife",
                "Avenida Engenheiro Abdias de Carvalho 1120", "", "Prado");

        Mockito.when(apiCorreios.buscarDadosPeloCep("50750254")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Luiz", "123", LocalDate.now(), "50750254");

        Assertions.assertEquals("Luiz", pessoa.getNome());
        Assertions.assertEquals("123", pessoa.getDocumento());
        Assertions.assertEquals("PE", pessoa.getEndereco().getUf());
    }
}
