import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class AssumptionsTeste {

    @Test
    void validarSomenteSeUsuarioForLuizC() {
        Assumptions.assumeTrue("luizc".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "luizc")
    void habilitarTesteSeUsuarioForLuizC() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "luizc")
    void desabilitarTesteSeUsuarioForLuizC() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void habilitarSomenteNoWindows() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    void habilitarNoWindowsELinux() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre(value = JRE.JAVA_17)
    void habilitarSomenteNoJava17() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    void validarAlgoSomenteNoUsuarioLuiz() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
