package br.edu.ifsp.exercicio.data;

public class Data4 {
	int dia;
	int mes;
	int ano;
	
	Data4(int dia, int mes, int ano){
		if (dia < 1 || dia > 31) {
			throw new RuntimeException("Dia invalido");
		}
		if (mes < 1 || mes > 12) {
			throw new RuntimeException("Mes invalido");
		}
		if (ano < 1) {
			throw new RuntimeException("Ano invalido");
		}
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}
