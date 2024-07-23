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
        return "\nCPF: " + cpf + "\nEndereço: " + endereco + "\nData de Nascimento: " + dataNascimento + "\n";
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
        
        Ator ator = new Ator(cpf, endereco, dataNascimento);
        atores.add(ator);
        System.out.println("Ator cadastrado com sucesso\n");
        
    }
    
    private static void listarAtores(){
        if(atores.isEmpty()){
            System.out.println("Nenhum ator encontrado");
        }else{
            System.out.println("Lista de atores \n");
            for(Ator ator : atores){
                System.out.println(ator);
                break;
            }
        }
    }
    
    private static void buscarAtor(){
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        
        boolean encontrado = false;
        for(Ator ator : atores){
            if(ator.getCpf().equals(cpf)){
                System.out.println("Ator encontrado\n");
                System.out.println(ator);
                System.out.println("\n");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Ator nao encontrado\n");
        }
    }
    
    private static void atualizarAtor(){
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        
        Ator atorEncontrado = null;
        for(Ator ator : atores){
            if(ator.getCpf().equals(cpf)){
                atorEncontrado = ator;
                break;
            }
        }
        if(atorEncontrado == null){
            System.out.println("Ator nao encontrado\n");
            return;
        }
        
        System.out.println("Novo Endereço: ()");
        String novoEndereco = scanner.nextLine();
        if(!novoEndereco.isEmpty()){
            atorEncontrado.setEndereco(novoEndereco);
        }
        System.out.println("Dados atualizado com sucesso\n");
        
    }
    
    private static void deletarAtor(){
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        
        boolean encontrado = false;
        Iterator<Ator> iterator = atores.iterator();
        while(iterator.hasNext()){
            Ator ator = iterator.next();
            if(ator.getCpf().equals(cpf)){
                iterator.remove();
                System.out.println("Ator removido com sucesso\n");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Ator nao encontrado\n");
        }
    }
    
}    




