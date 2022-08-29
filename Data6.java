package br.edu.ifsp.exercicio.data;

public class Data6 {
	int dia;
	int mes;
	int ano;
	
	Data6(int dia, int mes, int ano){
		int quantidadeDiasMes[] = {31,29,31,30,31,30,31,31,30,31,30};

		if (ano < 1) {
			throw new RuntimeException("Ano invalido");
		}

		if (mes < 1 || mes > 12) {
			throw new RuntimeException("Mes invalido");
		}
		if (dia < 1 || dia > quantidadeDiasMes[mes - 1]) {
			throw new RuntimeException("Dia invalido");
		}
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	boolean anoBissexto() {
		if ((ano % 4 == 0) && (ano % 100 != 0)) {
			if (ano % 400 == 0) {
				return false;
			} 
			return true;
		}
		
		return false;
	}
}
