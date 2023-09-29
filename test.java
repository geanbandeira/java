import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProcessamentoDePedidos {
    @Test
    public void testProcessamentoDePedido() {
        SistemaDePedidos sistema = new SistemaDePedidos();
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Item("Camiseta", 20.00, 2));
        pedido.adicionarItem(new Item("Calça", 30.00, 1));

        sistema.processarPedido(pedido);

        // Verifica se o total do pedido foi calculado corretamente
        assertEquals(70.00, pedido.getTotal(), 0.01);

        // Verifica se o cliente recebeu uma notificação de confirmação
        assertTrue(pedido.isConfirmado());
    }
}
