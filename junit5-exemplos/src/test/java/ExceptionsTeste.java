import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.junit.entities.Conta;
import com.junit.entities.TransferenciaConta;

public class ExceptionsTeste {
    
    @Test
    void validarCenarioExcecaoTransferencia() {
        Conta contaOrigem = new Conta("1010", "Luiz Neto", 100.0);
        Conta contaDestino = new Conta("2020", "Catarina", 200.0);

        TransferenciaConta tc = new TransferenciaConta();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tc.transferir(contaOrigem, contaDestino, -1);
        });
    }
}
