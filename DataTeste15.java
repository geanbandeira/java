package br.edu.ifsp.exercicio.data;

public class DataTeste15 {
  public static void main(String[] args) {
	Data15 data15 = new Data15(31,12,2022);
	Data15 novaData = data15.somarUmDia();
	System.out.println(novaData.getDia());
	System.out.println(novaData.getMes());
	System.out.println(novaData.getAno());
  }	
}
  