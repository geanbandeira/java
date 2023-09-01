import java.util.ArrayList;
import java.util.List;

// Classe para representar um Autor
class Autor {
    private String nome;

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

// Classe para representar um Livro
class Livro {
    private String titulo;
    private Autor autor;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return titulo + " por " + autor;
    }
}

// Classe para representar uma Biblioteca
class Biblioteca {
    private List<Livro> livrosDisponiveis;

    public Biblioteca() {
        livrosDisponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : livrosDisponiveis) {
            System.out.println(livro);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Autor 1");
        Autor autor2 = new Autor("Autor 2");

        Livro livro1 = new Livro("Livro 1", autor1);
        Livro livro2 = new Livro("Livro 2", autor1);
        Livro livro3 = new Livro("Livro 3", autor2);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.listarLivrosDisponiveis();
    }
}
