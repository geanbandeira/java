package br.edu.ifsp.exercicio.data;

public class DataTeste2 {
  public static void main(String[] args) {
	Data2 data2a = new Data2();
	data2a.dia = 30;
    data2a.mes = 10;
    data2a.ano = 2000;
    System.out.println(data2a.dia);
    System.out.println(data2a.mes);
    System.out.println(data2a.ano);
    

	Data2 data2b = new Data2();
	data2b.dia = 35;
    data2b.mes = 13;
    data2b.ano = -2000;
    System.out.println(data2b.dia);
    System.out.println(data2b.mes);
    System.out.println(data2b.ano);

	
  }
}
