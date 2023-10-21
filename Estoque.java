import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String loja;
    private List<Produto> produtos;

    public Estoque(String Loja){
        this.loja = Loja;
        this.produtos = new ArrayList<Produto>();
    }

    public void armazena(Produto produto){
        produtos.add(produto);
    }

    public String getLoja(){
        return loja;
    }
    public List<Produto> getProdutos(){
        return produtos;
    }


    
}
