package ExercicioTeste;

import ExercicioPrincipal.Exercicio;

public class Ex {

	public static void main(String[] args) {
	Exercicio e1 = new Exercicio();
	e1.cpf = 56564564;
	e1.rg = 65554154;
	e1.idade = 88;
	e1.nome = "Cristovão Colombo";
	
	System.out.println("Nome: " + e1.nome);
	
	System.out.println("idade: " + e1.idade);
	System.out.println("CPF: " + e1.cpf);
	System.out.println("RG: " + e1.rg);
	
		
	}
}
