package br.edu.ifsp.exercicio.data;

public class DataTeste6 {
  public static void main(String[] args) {
	Data6 data6a = new Data6(10,01,1900);
    System.out.println(data6a.dia);
    System.out.println(data6a.mes);
    System.out.println(data6a.ano);
    System.out.println(data6a.anoBissexto());
	Data6 data6b = new Data6(30,11,2020);
    System.out.println(data6b.dia);
    System.out.println(data6b.mes);
    System.out.println(data6b.ano);
    System.out.println(data6b.anoBissexto());
    
	
  }
}
