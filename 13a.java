package br.edu.ifsp.exercicio.data;

import java.util.Objects;

public class Data13 {
	private final int dia;
	private final int mes;
	private final int ano;

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	
	public Data13(int dia, int mes, int ano){
		verificaData(dia, mes, ano);
		this.dia = dia;
		this.mes = mes;
		this.ano =ano;
	}
	
	public Data13(){
		int dia = 1;
	    int mes = 1;
	    int ano = 1900;
		verificaData(dia, mes, ano);
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	private void verificaData(int dia, int mes, int ano) {
		int quantidadeDiasMes[] = {31,28,31,30,31,30,31,31,30,31,30};

		if (ano < 1) {
			throw new RuntimeException("Ano invalido");
		}
		//this.ano= ano;

		if (mes < 1 || mes > 12) {
			throw new RuntimeException("Mes invalido");
		}
		//this.mes = mes;
		if (anoBissexto()) {
		   quantidadeDiasMes[1]  = 29;
		}
		if (dia < 1 || dia > quantidadeDiasMes[mes - 1]) {
			throw new RuntimeException("Dia invalido");
		}
		//this.dia = dia;
	}
	
	public boolean anoBissexto() {
		if ((ano % 4 == 0) && (ano % 100 != 0)) {
			if (ano % 400 == 0) {
				return false;
			} 
			return true;
		}
		
		return false;
	}


	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data13 other = (Data13) obj;
		return ano == other.ano && dia == other.dia && mes == other.mes;
	}
	
	
}
