import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCompraIntegracao {
    @Test
    public void testCompraComPagamento() {
        AplicativoEcommerce app = new AplicativoEcommerce();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(new Produto("Camiseta", 20.00));
        carrinho.adicionarItem(new Produto("Calça", 30.00));

        // Realiza a compra com um serviço de pagamento real (simulado para o teste)
        boolean sucesso = app.finalizarCompra(carrinho, "1234-5678-9012-3456", "João");
        
        // Verifica se a compra foi bem-sucedida
        assertTrue(sucesso);
    }
}
