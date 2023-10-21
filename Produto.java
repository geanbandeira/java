public class Produto {
    private String nome;
    private double quantidade;
    private double estoqueMaximo;
    private double estoqueMinimo;

    public Produto (String nome, double quantidade, 
    double estoqueMinimo, double estoqueMaximo){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public double getQuantidade(){
        return quantidade;
    }

    public double getEstoqueMaximo(){
        return estoqueMaximo;
    }

    public double getEstoqueMinimo(){
        return estoqueMinimo;
    }

}
