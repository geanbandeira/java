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

    class Funcionario{
        private String cpff;
        private String rg;
        private String idFuncionario;
        private Contato contato;
        
        public Funcionario(String cpff, String rg, String idFuncionario, Contato contato){
            this.cpff = cpff;
            this.rg = rg;
            this.idFuncionario = idFuncionario;
            this.contato = contato;
        }
        
        public String getCpff(){
            return cpff;
        }
        
        public void setCpf(String cpff){
            this.cpff = cpff;
        }
        
        public String getRg(){
            return rg;
        }
        
        public void setRg(String rg){
            this.rg = rg;
        }
        
        public String idFuncionario(){
            return idFuncionario;
        }
        
        public void setIdFuncionario(String idFuncionario){
            this.idFuncionario = idFuncionario;
        }
        
        public Contato getContato(){
            return contato;
        }
        
        public void setContato(Contato contato){
            this.contato = contato;
        }
        
        public String toString(){
            return "\nId Funcionario: " + idFuncionario + "\nCPF: " + cpff + "\nRG: " + rg;
        }
    }
    
    class Fornecedor{
        private String idFornecedor;
        private String cnpj;
        private String razaoSocial;
        private Contato contato;
        
        public Fornecedor(String idFornecedor, String cnpj, String razaoSocial, Contato contato){
            this.idFornecedor = idFornecedor;
            this.cnpj = cnpj;
            this.razaoSocial = razaoSocial;
            this.contato = contato;
        }
        
        public String getIdFornecedor(){
            return idFornecedor;
        }
        
        public void setIdFornecedor(String idFornecedor){
            this.idFornecedor = idFornecedor;
        }
        
        public String getCnpj(){
            return cnpj;
        }
        
        public void setCnpj(String cnpj){
            this.cnpj = cnpj;
        }
        
        public String getRazaoSocial(){
            return razaoSocial;
        }
        
        public void setRazaoSocial(String razaoSocial){
            this.razaoSocial = razaoSocial;
        }
        
        public Contato getContato(){
            return contato;
        }
        
        public void setContato(Contato contato){
            this.contato = contato;
        }
        
        public String toString(){
            return "\nID Fornecedor: " + idFornecedor + "\nCnpj: " + cnpj + "\nRazao Social: " + razaoSocial;
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
        System.out.println("Cliente\n");
        System.out.println(cliente);
        
        System.out.println("ID Fornecedor: ");
        String idFornecedor = scanner.nextLine();
        System.out.println("Cnpj: ");
        String cnpj = scanner.nextLine();
        System.out.println("Razao Social: ");
        String razaoSocial = scanner.nextLine();
        
        Fornecedor fornecedor = new Fornecedor(idFornecedor, cnpj, razaoSocial, contato);
        System.out.println("Fornecedor\n");
        System.out.println(fornecedor);
        
        System.out.println("CPF: ");
        String cpff = scanner.nextLine();
        System.out.println("RG: ");
        String rg = scanner.nextLine();
        System.out.println("ID Funcionario: ");
        String idFuncionario = scanner.nextLine();
        Funcionario funcionario = new Funcionario(cpff, rg, idFuncionario, contato);
        System.out.println("Funcionario\n");
        System.out.println(funcionario);
        
	}
}
