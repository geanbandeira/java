import java.util.Scanner;
import java.util.*;

class Ator{
    private String cpf;
    private String endereco;
    private String dataNascimento;
    
    public Ator(String cpf, String endereco, String dataNascimento){
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getDataNascimento(){
        return dataNascimento;
    }
    
    public void setgetDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String toString(){
        return "\nCPF: " + cpf + "\nEndereço: " + endereco + "\nData de Nascimento: " + dataNascimento "\n";
    }
}


public class Main{
    public static ArrayList<Ator> atores = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

    int opcao = 0;
    
    do{
        mostrarMenu();
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch(opcao){
            case 1:
                cadastrarAtor();
                break;
            case 2:
                listarAtores();
                break;
            case 3:
                buscarAtor();
                break;
            case 4:
                atualizarAtor();
                break;
            case 5:
                deletarAtor();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opçao invalida, tente novamento\n");
        }
    }while(opcao !=0 );
}

    private static void mostrarMenu(){
        System.out.println("1. Cadastrar Ator: ");
        System.out.println("2. Listar Atores: ");
        System.out.println("3. Buscar Ator: ");
        System.out.println("4. Atualizar Ator: ");
        System.out.println("5. Deletar Ator: ");
        System.out.println("0. Sair");
        System.out.println("Escolha uma das opçoes\n");
    }
    
    private static void cadastrarAtor(){
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.println("");
        
    }
    
    private static void listarAtores(){
        
    }
    
    private static void buscarAtor(){
        
    }
    
    private static void atualizarAtor(){
        
    }
    
    private static void deletarAtor(){
        
    }
    
    
    
}    
