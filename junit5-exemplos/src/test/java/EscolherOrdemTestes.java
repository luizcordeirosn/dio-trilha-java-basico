import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolherOrdemTestes {
    
    @Order(4)
    @Test
    void validarFluxoA() {
        System.out.println("Executando Fluxo A");
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validarFluxoB() {
        System.out.println("Executando Fluxo B");
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validarFluxoC() {
        System.out.println("Executando Fluxo C");
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validarFluxoD() {
        System.out.println("Executando Fluxo D");
        Assertions.assertTrue(true);
    }
}