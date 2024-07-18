import java.util.Scanner;

class Cliente{
    private String idCliente;
    private String cpf;
    private String endereco;
    private Contato contato;
    
    public Cliente(String idCliente, String cpf, String endereco, Contato contato){
        this.idCliente = idCliente;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
    }
    
    public String getIdCliente(){
        return idCliente;
    }
    
    public void setIdCliente(String idCliente){
        this.idCliente = idCliente;
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
    
    public Contato getContato(){
        return contato;
    }
    
    public void setContato(Contato contato){
        this.contato = contato;
    }
    
    
    public String toString(){
        return "\nID Cliente: " + idCliente + "\nCPF: " + cpf + "\nEndereço: " + endereco;
    }
}

class Contato{
    private String nome;
    private String telefone;
    private String email;
    
    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nTelefone:  "+ telefone + "\nEmail: " + email;
    }
    
}


public class Main{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        
        Contato contato = new Contato(nome, telefone, email);
        
        System.out.println("ID cliente: ");
        String idCliente = scanner.nextLine();
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();
        
        Cliente cliente = new Cliente(idCliente, cpf, endereco, contato);
        System.out.println(cliente);
        
        
        
        
        
	}
}
