import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.entities.BancoDados;
import com.junit.entities.Pessoa;

public class ConsultarDadosPessoaTeste {
    
    @BeforeAll
    static void configuraConexao() {
        BancoDados.iniciarConexao();
        System.out.println("Rodou configuraConexao()");
    }

    @BeforeEach
    void inserirDados() {
        BancoDados.inserirDados(new Pessoa("Luiz", LocalDateTime.of(2000, 2, 13, 0, 0, 0)));
    }

    @AfterEach
    void removerDados() {
        BancoDados.removerDados(new Pessoa("Luiz", LocalDateTime.of(2000, 2, 13, 0, 0, 0)));
    }

    @Test
    void validarDadosRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosSegundoRetorno() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDados.finalizarConexao();
        System.out.println("Rodou finalizarConexao()");
    }
}
