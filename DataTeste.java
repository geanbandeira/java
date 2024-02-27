package br.edu.ifsp.teste;
import br.edu.ifsp.utilitarios.Data;

public class DataTeste {
	
	public static void main(String[] args) {
		Data d1 = new Data( 22,12,2040);

		
		//Data d2 = new Data();
		System.out.println(d1.dia);
		System.out.println(d1.mes);
		System.out.println(d1.ano);
	}
}
