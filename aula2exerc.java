import java.util.Scanner;
import java.util.*;

class Paciente{
    private String nome;
	private String dataNascimento;
	private Double idade;
    
    public Paciente(String nome, String dataNascimento, Double idade){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }
}

public class Main{
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Nome: ");
    String nome = scanner.nextLine();
    System.out.println("Data de nascimento: (dd/mm/yyyy)");
    String dataNascimento = scanner.nextLine();
    System.out.println("Idade: ");
    Double idade = scanner.nextDouble();
    
    if(idade < 16){
        System.out.println("\nNao Eleitor\n");
        System.out.println(idade);
    }else if(idade <18){
        System.out.println("\nEleitor Facultativo\n");
        System.out.println(idade);
    }else if(idade < 65){
        System.out.println("\nEleitor Obrigatorio\n");
        System.out.println(idade);
    }else if(idade > 65){
        System.out.println("\nEleitor Facultativo \n");
        System.out.println(idade);
    }else{
        System.out.println("\nFez coisa errada camarada\n");
    }
	}
}
