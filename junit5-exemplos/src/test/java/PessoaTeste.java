import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.junit.entities.Pessoa;

public class PessoaTeste {
    
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa pessoa = new Pessoa("Luiz", 
            LocalDateTime.of(2000, 2, 13, 0, 0, 0));
        
        Assertions.assertEquals(24, pessoa.getIdade());
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());
    }
}
