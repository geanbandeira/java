import java.util.Scanner;
import java.util.*;
import java.util.List;

class Jogador{
    private String idJogador;
    private String endereco;
    private Contato contato;
    
    public Jogador(String idJogador, String endereco, Contato contato){
        this.idJogador = idJogador;
        this.endereco = endereco;
        this.contato = contato;
    }
    
    public String getIdjogador(){
        return idJogador;
    }
    
    public void setIdJogador(String idJogador){
        this.idJogador = idJogador;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public Contato getContato(){
        return contato;
    }
    
    public void setContato(Contato contato){
        this.contato = contato;
    } 
    
    
    public String toString(){
        return "\nID Jogador: " + idJogador + "\nEndereço: " + endereco ;
    }
}

class Contato{
    private String nome;
    private String email;
    private String telefone;
    
    public Contato(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone ;
    }
}

public class Main{
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Nome: ");
    String nome = scanner.nextLine();
    System.out.println("Email: ");
    String email = scanner.nextLine();
    System.out.println("Telefone: ");
    String telefone = scanner.nextLine();
    
    Contato contato = new Contato(nome, email, telefone);
    
    System.out.println("ID Jogador: \n");
    String idJogador = scanner.nextLine();
    
    System.out.println("Endereço: ");
    String endereco = scanner.nextLine();
    
    Jogador jogador = new Jogador(idJogador, endereco, contato);
    System.out.println("\n");
    System.out.println(jogador);
    System.out.println("\n");

	}
}
