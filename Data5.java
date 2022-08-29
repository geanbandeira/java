package br.edu.ifsp.exercicio.data;

public class Data5 {
	int dia;
	int mes;
	int ano;
	
	Data5(int dia, int mes, int ano){
		int quantidadeDiasMes[] = {31,29,31,30,31,30,31,31,30,31,30, 31};
    	if (mes < 1 || mes > 12) {
			throw new RuntimeException("Mes invalido");
		}
    	if (dia < 1 || dia > quantidadeDiasMes[mes - 1]) {
			throw new RuntimeException("Dia invalido");
		}
		if (ano < 1) {
			throw new RuntimeException("Ano invalido");
		}
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}
