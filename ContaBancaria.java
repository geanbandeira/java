import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestContaBancaria {
    @Test
    public void testDeposito() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.0);
        assertEquals(100.0, conta.getSaldo(), 0.01);
    }

    @Test
    public void testSaque() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.0);
        conta.sacar(30.0);
        assertEquals(70.0, conta.getSaldo(), 0.01);
    }
}
