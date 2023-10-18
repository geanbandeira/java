import java.util.ArrayList;
import java.util.List;

class Livro {
    private String titulo;
    private boolean disponivel;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }
}

class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : livros) {
            if (livro.estaDisponivel()) {
                System.out.println(livro.getTitulo());
            }
        }
    }

    public void alugarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && livro.estaDisponivel()) {
                livro.emprestar();
                System.out.println("Você alugou o livro: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Desculpe, o livro não está disponível para aluguel.");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && !livro.estaDisponivel()) {
                livro.devolver();
                System.out.println("Você devolveu o livro: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Não é possível devolver este livro, pois não está alugado ou não existe na biblioteca.");
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Casmurro");
        Livro livro2 = new Livro("O Senhor dos Anéis");
        Livro livro3 = new Livro("1984");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.listarLivrosDisponiveis();

        biblioteca.alugarLivro("Dom Casmurro");
        biblioteca.alugarLivro("O Senhor dos Anéis");

        biblioteca.listarLivrosDisponiveis();

        biblioteca.devolverLivro("O Senhor dos Anéis");

        biblioteca.listarLivrosDisponiveis();
    }
}
