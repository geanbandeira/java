import java.util.Scanner;

class Skatista{
    private String idSkatista;
    private String endereco;
    private Contato contato;
    
    public Skatista(String idSkatista, String endereco, Contato contato){
        this.idSkatista = idSkatista;
        this.endereco = endereco;
        this.contato = contato;
    }
    
    public String getIdSkatista(){
        return idSkatista;
    }
    
    public void idSkatista(String idSkatista){
        this.idSkatista = idSkatista;
    }
    
    public String endereco(){
        return endereco;
    }
    
    public Contato getContato(){
        return contato;
    }
    
    public void setContato(Contato contato){
        this.contato = contato;
    }
    
    public String toString(){
        return "\nID Skatista: " + idSkatista + "\nEndereço: \n" + endereco;
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
        return "\nNome: \n" + nome + "\nTelefone: " + telefone + "\nEmail: \n" + email;
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
        
        System.out.println("ID Skatista: ");
        String idSkatista = scanner.nextLine();
        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();
        
        Skatista skatista = new Skatista(idSkatista, endereco, contato);
        System.out.println("Skatistas: \n");
        System.out.println(skatista);

	}
}
