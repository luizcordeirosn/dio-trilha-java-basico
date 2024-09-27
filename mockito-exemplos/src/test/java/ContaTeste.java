import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import com.mockito.entities.Conta;

@ExtendWith(MockitoExtension.class)
class ContaTeste {
    
    @Spy
    private Conta conta = new Conta(3500);

    @Test
    void validarOrdemChamadas() {

        conta.pagarBoleto(300);

        InOrder inOrder = Mockito.inOrder(conta);

        inOrder.verify(conta).pagarBoleto(300);
        inOrder.verify(conta).validarSaldo(300);
        inOrder.verify(conta).debitarSaldo(300);
        inOrder.verify(conta).enviarCreditoParaEmissor(300);
    }

    @Test
    void validarQuantidadeChamadas() {
        conta.validarSaldo(300);
        conta.validarSaldo(500);
        conta.validarSaldo(600);

        Mockito.verify(conta, Mockito.times(3)).validarSaldo(ArgumentMatchers.anyInt());
    }

    @Test
    void retornaTrueParaQualquerValorValidacaoSaldo() {
        Mockito.doNothing().when(conta).validarSaldo(ArgumentMatchers.anyInt());
        conta.validarSaldo(3500);
    }
}
