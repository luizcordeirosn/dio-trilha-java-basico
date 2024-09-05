import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.junit.entities.Pessoa;

public class AssestionsTeste {
    
    @Test
    void validarLancamentos() {

        int [] primeiroLancamento = {10,20,30,40,50};
        int [] segundoLancamento = {10,20,30,40,50};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {

        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luiz", LocalDateTime.now());

        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        
        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor, outroValor);
    }
}
